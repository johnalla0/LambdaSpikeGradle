package jensen.lambda;

import org.apache.http.HttpHost;
import org.elasticsearch.client.*;

import java.io.IOException;

public class AwsLambdaElasticSpike {

    public void lookupData() throws IOException {

        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http"),
                        new HttpHost("localhost", 9201, "http")));

        client.close();

    }


}
