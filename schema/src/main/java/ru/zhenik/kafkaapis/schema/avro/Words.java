/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.zhenik.kafkaapis.schema.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Word list */
@org.apache.avro.specific.AvroGenerated
public class Words extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1534782436926772425L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Words\",\"namespace\":\"ru.zhenik.kafkaapis.schema.avro\",\"doc\":\"Word list\",\"fields\":[{\"name\":\"list\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Word\",\"fields\":[{\"name\":\"payload\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Word\"},{\"name\":\"sorted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Sorted payload\",\"default\":null}]}}],\"doc\":\"List of words\",\"default\":null}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Words> ENCODER =
      new BinaryMessageEncoder<Words>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Words> DECODER =
      new BinaryMessageDecoder<Words>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Words> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Words> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Words>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Words to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Words from a ByteBuffer. */
  public static Words fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** List of words */
   private java.util.List<ru.zhenik.kafkaapis.schema.avro.Word> list;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Words() {}

  /**
   * All-args constructor.
   * @param list List of words
   */
  public Words(java.util.List<ru.zhenik.kafkaapis.schema.avro.Word> list) {
    this.list = list;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return list;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: list = (java.util.List<ru.zhenik.kafkaapis.schema.avro.Word>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'list' field.
   * @return List of words
   */
  public java.util.List<ru.zhenik.kafkaapis.schema.avro.Word> getList() {
    return list;
  }


  /**
   * Creates a new Words RecordBuilder.
   * @return A new Words RecordBuilder
   */
  public static ru.zhenik.kafkaapis.schema.avro.Words.Builder newBuilder() {
    return new ru.zhenik.kafkaapis.schema.avro.Words.Builder();
  }

  /**
   * Creates a new Words RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Words RecordBuilder
   */
  public static ru.zhenik.kafkaapis.schema.avro.Words.Builder newBuilder(ru.zhenik.kafkaapis.schema.avro.Words.Builder other) {
    return new ru.zhenik.kafkaapis.schema.avro.Words.Builder(other);
  }

  /**
   * Creates a new Words RecordBuilder by copying an existing Words instance.
   * @param other The existing instance to copy.
   * @return A new Words RecordBuilder
   */
  public static ru.zhenik.kafkaapis.schema.avro.Words.Builder newBuilder(ru.zhenik.kafkaapis.schema.avro.Words other) {
    return new ru.zhenik.kafkaapis.schema.avro.Words.Builder(other);
  }

  /**
   * RecordBuilder for Words instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Words>
    implements org.apache.avro.data.RecordBuilder<Words> {

    /** List of words */
    private java.util.List<ru.zhenik.kafkaapis.schema.avro.Word> list;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ru.zhenik.kafkaapis.schema.avro.Words.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.list)) {
        this.list = data().deepCopy(fields()[0].schema(), other.list);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Words instance
     * @param other The existing instance to copy.
     */
    private Builder(ru.zhenik.kafkaapis.schema.avro.Words other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.list)) {
        this.list = data().deepCopy(fields()[0].schema(), other.list);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'list' field.
      * List of words
      * @return The value.
      */
    public java.util.List<ru.zhenik.kafkaapis.schema.avro.Word> getList() {
      return list;
    }

    /**
      * Sets the value of the 'list' field.
      * List of words
      * @param value The value of 'list'.
      * @return This builder.
      */
    public ru.zhenik.kafkaapis.schema.avro.Words.Builder setList(java.util.List<ru.zhenik.kafkaapis.schema.avro.Word> value) {
      validate(fields()[0], value);
      this.list = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'list' field has been set.
      * List of words
      * @return True if the 'list' field has been set, false otherwise.
      */
    public boolean hasList() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'list' field.
      * List of words
      * @return This builder.
      */
    public ru.zhenik.kafkaapis.schema.avro.Words.Builder clearList() {
      list = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Words build() {
      try {
        Words record = new Words();
        record.list = fieldSetFlags()[0] ? this.list : (java.util.List<ru.zhenik.kafkaapis.schema.avro.Word>) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Words>
    WRITER$ = (org.apache.avro.io.DatumWriter<Words>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Words>
    READER$ = (org.apache.avro.io.DatumReader<Words>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}