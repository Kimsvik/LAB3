package LR3.Model;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;

public class JsonParser{
    private static ObjectMapper mapper = new ObjectMapper();

    public static String dataToString(NodeData nodeData) {
        String dataString;
        try {
            dataString = mapper.writeValueAsString(nodeData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dataString;
    }

    public static NodeData parseData(String dataString) {
        NodeData nodeData;
        try {
            nodeData = mapper.readValue(dataString, NodeData.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nodeData;
    }
}
