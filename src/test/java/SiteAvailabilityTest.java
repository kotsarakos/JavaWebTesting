import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SiteAvailabilityTest {

    @Test
    void testCheckboxesIsUp() throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://the-internet.herokuapp.com/checkboxes"))
                .GET()
                .build();

        HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());

        
        int status = response.statusCode();
        assertTrue(status == 200 || status == 301 || status == 302, "checkboxes is not up, status code: " + status);
    }


}
