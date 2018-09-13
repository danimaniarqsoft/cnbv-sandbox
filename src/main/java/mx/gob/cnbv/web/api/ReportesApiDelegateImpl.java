package mx.gob.cnbv.web.api;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

@Service
public class ReportesApiDelegateImpl implements SolicitudReportesApiDelegate {

	private final NativeWebRequest request;

	public ReportesApiDelegateImpl(NativeWebRequest request) {
		this.request = request;
	}

	@Override
	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}
}
