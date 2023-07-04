
public class JsonToXmlAdapter implements IAdapter{
    private JSON json;
    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }

    @Override
    public XML convert(Object data) {
        System.out.println("JSON to XML conversion....");
        return this.json.convertToXML();
    }
}