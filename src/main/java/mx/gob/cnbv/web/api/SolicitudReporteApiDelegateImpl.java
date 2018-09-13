package mx.gob.cnbv.web.api;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

@Service
public class SolicitudReporteApiDelegateImpl implements ReportesApiDelegate {

	private final NativeWebRequest request;

	public SolicitudReporteApiDelegateImpl(NativeWebRequest request) {
		this.request = request;
	}

	@Override
	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}
}
