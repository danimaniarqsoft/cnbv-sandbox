package mx.gob.cnbv.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T03:06:13.088-05:00[America/Mexico_City]")

@Controller
@RequestMapping("/api")
public class ReportesApiController implements ReportesApi {

    private final ReportesApiDelegate delegate;

    public ReportesApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ReportesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ReportesApiDelegate() {});
    }

    @Override
    public ReportesApiDelegate getDelegate() {
        return delegate;
    }

}
