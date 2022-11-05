package roomdoor.bepotest.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import roomdoor.bepotest.service.TestTableService;

@RestController
@AllArgsConstructor
public class BepoController {

	private final TestTableService testTableService;

	@GetMapping()
	public ResponseEntity<?> main() {
		return ResponseEntity.ok("hi ");
	}


	@GetMapping("/bepo")
	public ResponseEntity<?> textPrint(@RequestParam String text) {

		return ResponseEntity.ok("입력한 내용 : " + text);
	}

	@GetMapping("/save")
	public ResponseEntity<?> dbTestSave(@RequestParam String text) {

		return ResponseEntity.ok(testTableService.save(text));
	}

	@GetMapping("/get")
	public ResponseEntity<?> dbTestGet(@RequestParam Long id) {

		return ResponseEntity.ok(testTableService.get(id));
	}
}
