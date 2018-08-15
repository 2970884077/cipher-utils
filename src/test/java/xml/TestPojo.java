package xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 2018/8/14 下午3:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestPojo {

    private String status;

    private double amount;

    private boolean success;

    private int count;

    private ContentPojo content;

    private LinkedList<Map<String, String>> list;

    private ArrayList<ContentPojo> contentList;

    private HashMap<String, String> map;

    private HashMap<String, ContentPojo> contentMap;

}
