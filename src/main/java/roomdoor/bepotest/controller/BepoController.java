package roomdoor.bepotest.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BepoController {

	//	private final TestTableService testTableService;
	@Value("${yml.test.text}")
	private String yml;

	@GetMapping()
	public ResponseEntity<?> main() {
		return ResponseEntity.ok("hi " + yml);
	}


	@GetMapping("/bepo")
	public ResponseEntity<?> textPrint(@RequestParam String text) {
		return ResponseEntity.ok("입력한 내용 : " + text);
	}
}
