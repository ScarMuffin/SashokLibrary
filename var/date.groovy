import java.text.SimpleDateFormat
public String ourDateStamp(String dateFormat) {
    def date = new Date()
    def sdf
    if (dateFormat == "ddmmyy") {
     sdf = new SimpleDateFormat("MM/dd/yyyy")
    } else {
     sdf = new SimpleDateFormat("dd/MM/yyyy")
    }
println sdf.format(date)
}
