package hm.binkley.spring.axon.monitoring;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.boot.actuate.audit.AuditEventRepository;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
class TestAuditEventRepository
        implements AuditEventRepository {
    private final MonitoringTestConfiguration configuration;

    @Override
    public List<AuditEvent> find(final String principal, final Date after) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(final AuditEvent event) {
        configuration.trail.add(event);
    }
}
