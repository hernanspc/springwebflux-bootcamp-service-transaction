package com.springwebflux.bootcamp.service.transaction.app.model;
import java.util.Date;
 
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="transaction")
public class Transaction {
	
@Id 
private String id;
private String nrodoc;
private String tip_acc;
private Date fec_operation;

}
