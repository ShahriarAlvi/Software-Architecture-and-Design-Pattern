public class Client {

    public static void main(String[] args) {

        JSON json = new JSON("json data");
        IAdapter iAdapter = new JsonToXmlAdapter(json);
        XML JsonXml = iAdapter.convert(json);

        Protobuf protobuf = new Protobuf("protobuf data");
        IAdapter iAdapter2 = new ProtobufToXmlAdapter(protobuf);
        XML protobufXml =iAdapter2.convert(protobuf);
    }

}
