package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
  public List<SoftwareEngineerModel> getSoftwareEngineers()
  {
    return List.of(
      new SoftwareEngineerModel(1, "James,","node, react"),
      new SoftwareEngineerModel(2, "Bob", "Java, PHP")
    );
  }
}
