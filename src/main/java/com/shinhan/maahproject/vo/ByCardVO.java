package com.shinhan.maahproject.vo;

import java.sql.Timestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode //모든 칼럼을 비교하여 내용 같아야 함
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "by_card")
public class ByCardVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int by_code;
	@NonNull
	@Column(nullable = false)
	private String by_name;
	private Timestamp by_regdate;
	@NonNull
	@Column(nullable = false)
	private Double by_overdue_rate;
	private int by_year_price;
	private int by_min_limit;
	private String by_category_list;
	@NonNull
	@Column(nullable = false)
	private int by_status;
	@NonNull
	@Column(nullable = false)
	private String by_image_path;
	private boolean by_is_transport;

}
