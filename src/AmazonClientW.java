import awsClient.AWSECommerceService;
import awsClient.AWSECommerceServicePortType;
import awsClient.ItemSearch;
import awsClient.ItemSearchRequest;
import awsClient.Items;
import awsClient.Item;
import awsClient.OperationRequest;
import awsClient.SearchResultsMap;

import javax.xml.ws.Holder;

import java.util.List;
import java.util.ArrayList;

public class AmazonClientW {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Usage:java AmazonClientW <access key>");
			return;
		}
		final String access_key = args[0];

		AWSECommerceService service = new AWSECommerceService();
		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();

		ItemSearchRequest request = new ItemSearchRequest();
		request.setSearchIndex("Books");
		request.setKeywords("quantum gravity");

		ItemSearch search = new ItemSearch();
		search.getRequest().add(request);
		search.setAWSAccessKeyId(access_key);

		Holder<OperationRequest> operation_request = null;
		Holder<List<Items>> items = new Holder<List<Items>>();

		port.itemSearch(search.getMarketplaceDomain(),
				search.getAWSAccessKeyId(), 
				search.getAssociateTag(),
				search.getXMLEscaping(), 
				search.getValidate(),
				search.getShared(), 
				search.getRequest(), 
				operation_request,
				items);
		Items retval = items.value.get(0);
		List<Item> item_list = retval.getItem();
		for(Item item : item_list) {
			System.out.println(item.getItemAttributes().getTitle());
		}
	}
}
