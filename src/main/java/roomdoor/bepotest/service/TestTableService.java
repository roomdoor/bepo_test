package roomdoor.bepotest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import roomdoor.bepotest.domain.TestTable;
import roomdoor.bepotest.ropository.TestTableRepository;

@Service
@RequiredArgsConstructor
public class TestTableService {

	private final TestTableRepository testTableRepository;


	public TestTable save(String text) {
		return testTableRepository.save(TestTable.builder().text(text).build());
	}

	public TestTable get(Long id) {
		return testTableRepository.findById(id).orElseThrow(null);
	}
}
