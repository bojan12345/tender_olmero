package com.olmero.tender.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTenderRequest {

	private String workDescription;
	private Long issuerId;
}
