package Lesson_6.work2;

public interface ReportGenerator extends JsonGenerator, XmlGenerator {
    String generateXml();
    String generateJson();
}