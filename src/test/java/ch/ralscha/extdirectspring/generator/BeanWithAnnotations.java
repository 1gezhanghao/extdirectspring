package ch.ralscha.extdirectspring.generator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

@Model(value = "Sch.Bean", idProperty = "aInt", paging = true, readMethod = "read", createMethod = "create", updateMethod = "update", destroyMethod = "destroy")
public class BeanWithAnnotations {

	@ModelField("by")
	private byte aByte;

	private short aShort;

	private int aInt;

	@ModelField(value = "lo", defaultValue = "-1")
	private long aLong;

	@ModelField(type = ModelType.STRING)
	private Byte aByteObject;

	@ModelField(type = ModelType.FLOAT)
	private Short aShortObject;

	@ModelField(useNull = false)
	private Integer aIntObject;

	@ModelField(useNull = true)
	private Long aLongObject;

	private BigDecimal aBigDecimal;

	@ModelField(defaultValue = "1")
	private BigInteger aBigInteger;

	@ModelField(defaultValue = "1.1")
	private float aFloat;

	@ModelField(dateFormat = "c")
	private double aDouble;

	private Float aFloatObject;

	private Double aDoubleObject;

	@ModelField(useNull = true)
	private String aString;

	@ModelField(defaultValue = "true")
	private boolean aBoolean;

	@ModelField(defaultValue = "false")
	private Boolean aBooleanObject;

	@ModelField(dateFormat = "c")
	private Date aDate;

	private java.sql.Date aSqlDate;

	private Timestamp aTimestamp;

	@ModelField(dateFormat = "d.m.y", useNull = true)
	private DateTime aDateTime;

	private LocalDate aLocalDate;

	public byte getaByte() {
		return aByte;
	}

	public void setaByte(byte aByte) {
		this.aByte = aByte;
	}

	public short getaShort() {
		return aShort;
	}

	public void setaShort(short aShort) {
		this.aShort = aShort;
	}

	public int getaInt() {
		return aInt;
	}

	public void setaInt(int aInt) {
		this.aInt = aInt;
	}

	public long getaLong() {
		return aLong;
	}

	public void setaLong(long aLong) {
		this.aLong = aLong;
	}

	public Byte getaByteObject() {
		return aByteObject;
	}

	public void setaByteObject(Byte aByteObject) {
		this.aByteObject = aByteObject;
	}

	public Short getaShortObject() {
		return aShortObject;
	}

	public void setaShortObject(Short aShortObject) {
		this.aShortObject = aShortObject;
	}

	public Integer getaIntObject() {
		return aIntObject;
	}

	public void setaIntObject(Integer aIntObject) {
		this.aIntObject = aIntObject;
	}

	public Long getaLongObject() {
		return aLongObject;
	}

	public void setaLongObject(Long aLongObject) {
		this.aLongObject = aLongObject;
	}

	public BigDecimal getaBigDecimal() {
		return aBigDecimal;
	}

	public void setaBigDecimal(BigDecimal aBigDecimal) {
		this.aBigDecimal = aBigDecimal;
	}

	public BigInteger getaBigInteger() {
		return aBigInteger;
	}

	public void setaBigInteger(BigInteger aBigInteger) {
		this.aBigInteger = aBigInteger;
	}

	public float getaFloat() {
		return aFloat;
	}

	public void setaFloat(float aFloat) {
		this.aFloat = aFloat;
	}

	public double getaDouble() {
		return aDouble;
	}

	public void setaDouble(double aDouble) {
		this.aDouble = aDouble;
	}

	public Float getaFloatObject() {
		return aFloatObject;
	}

	public void setaFloatObject(Float aFloatObject) {
		this.aFloatObject = aFloatObject;
	}

	public Double getaDoubleObject() {
		return aDoubleObject;
	}

	public void setaDoubleObject(Double aDoubleObject) {
		this.aDoubleObject = aDoubleObject;
	}

	public String getaString() {
		return aString;
	}

	public void setaString(String aString) {
		this.aString = aString;
	}

	public boolean isaBoolean() {
		return aBoolean;
	}

	public void setaBoolean(boolean aBoolean) {
		this.aBoolean = aBoolean;
	}

	public Boolean getaBooleanObject() {
		return aBooleanObject;
	}

	public void setaBooleanObject(Boolean aBooleanObject) {
		this.aBooleanObject = aBooleanObject;
	}

	public Date getaDate() {
		return aDate;
	}

	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}

	public java.sql.Date getaSqlDate() {
		return aSqlDate;
	}

	public void setaSqlDate(java.sql.Date aSqlDate) {
		this.aSqlDate = aSqlDate;
	}

	public Timestamp getaTimestamp() {
		return aTimestamp;
	}

	public void setaTimestamp(Timestamp aTimestamp) {
		this.aTimestamp = aTimestamp;
	}

	public DateTime getaDateTime() {
		return aDateTime;
	}

	public void setaDateTime(DateTime aDateTime) {
		this.aDateTime = aDateTime;
	}

	public LocalDate getaLocalDate() {
		return aLocalDate;
	}

	public void setaLocalDate(LocalDate aLocalDate) {
		this.aLocalDate = aLocalDate;
	}

	public static List<ModelFieldBean> expectedFields = new ArrayList<ModelFieldBean>();
	static {

		ModelFieldBean field = new ModelFieldBean("by", ModelType.INTEGER);
		expectedFields.add(field);

		field = new ModelFieldBean("aShort", ModelType.INTEGER);
		expectedFields.add(field);

		field = new ModelFieldBean("aInt", ModelType.INTEGER);
		expectedFields.add(field);

		field = new ModelFieldBean("lo", ModelType.INTEGER);
		field.setDefaultValue(-1l);
		expectedFields.add(field);

		field = new ModelFieldBean("aByteObject", ModelType.STRING);
		expectedFields.add(field);

		field = new ModelFieldBean("aShortObject", ModelType.FLOAT);
		expectedFields.add(field);

		field = new ModelFieldBean("aIntObject", ModelType.INTEGER);
		expectedFields.add(field);

		field = new ModelFieldBean("aLongObject", ModelType.INTEGER);
		field.setUseNull(true);
		expectedFields.add(field);

		field = new ModelFieldBean("aBigDecimal", ModelType.FLOAT);
		expectedFields.add(field);

		field = new ModelFieldBean("aBigInteger", ModelType.INTEGER);
		field.setDefaultValue(1l);
		expectedFields.add(field);

		field = new ModelFieldBean("aFloat", ModelType.FLOAT);
		field.setDefaultValue(1.1);
		expectedFields.add(field);

		field = new ModelFieldBean("aDouble", ModelType.FLOAT);
		expectedFields.add(field);

		field = new ModelFieldBean("aFloatObject", ModelType.FLOAT);
		expectedFields.add(field);

		field = new ModelFieldBean("aDoubleObject", ModelType.FLOAT);
		expectedFields.add(field);

		field = new ModelFieldBean("aString", ModelType.STRING);
		field.setUseNull(true);
		expectedFields.add(field);

		field = new ModelFieldBean("aBoolean", ModelType.BOOLEAN);
		field.setDefaultValue(true);
		expectedFields.add(field);

		field = new ModelFieldBean("aBooleanObject", ModelType.BOOLEAN);
		field.setDefaultValue(false);
		expectedFields.add(field);

		field = new ModelFieldBean("aDate", ModelType.DATE);
		field.setDateFormat("c");
		expectedFields.add(field);

		field = new ModelFieldBean("aSqlDate", ModelType.DATE);
		expectedFields.add(field);

		field = new ModelFieldBean("aTimestamp", ModelType.DATE);
		expectedFields.add(field);

		field = new ModelFieldBean("aDateTime", ModelType.DATE);
		field.setDateFormat("d.m.y");
		expectedFields.add(field);

		field = new ModelFieldBean("aLocalDate", ModelType.DATE);
		expectedFields.add(field);
	}

}
