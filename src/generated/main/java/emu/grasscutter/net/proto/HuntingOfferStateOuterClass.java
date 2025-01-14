// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HuntingOfferState.proto

package emu.grasscutter.net.proto;

public final class HuntingOfferStateOuterClass {
  private HuntingOfferStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: NAEFMCHLNCK
   * </pre>
   *
   * Protobuf enum {@code HuntingOfferState}
   */
  public enum HuntingOfferState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HUNTING_OFFER_STATE_NONE = 0;</code>
     */
    HUNTING_OFFER_STATE_NONE(0),
    /**
     * <code>HUNTING_OFFER_STATE_STARTED = 1;</code>
     */
    HUNTING_OFFER_STATE_STARTED(1),
    /**
     * <code>HUNTING_OFFER_STATE_UNSTARTED = 2;</code>
     */
    HUNTING_OFFER_STATE_UNSTARTED(2),
    /**
     * <code>HUNTING_OFFER_STATE_SUCC = 3;</code>
     */
    HUNTING_OFFER_STATE_SUCC(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HUNTING_OFFER_STATE_NONE = 0;</code>
     */
    public static final int HUNTING_OFFER_STATE_NONE_VALUE = 0;
    /**
     * <code>HUNTING_OFFER_STATE_STARTED = 1;</code>
     */
    public static final int HUNTING_OFFER_STATE_STARTED_VALUE = 1;
    /**
     * <code>HUNTING_OFFER_STATE_UNSTARTED = 2;</code>
     */
    public static final int HUNTING_OFFER_STATE_UNSTARTED_VALUE = 2;
    /**
     * <code>HUNTING_OFFER_STATE_SUCC = 3;</code>
     */
    public static final int HUNTING_OFFER_STATE_SUCC_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HuntingOfferState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HuntingOfferState forNumber(int value) {
      switch (value) {
        case 0: return HUNTING_OFFER_STATE_NONE;
        case 1: return HUNTING_OFFER_STATE_STARTED;
        case 2: return HUNTING_OFFER_STATE_UNSTARTED;
        case 3: return HUNTING_OFFER_STATE_SUCC;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HuntingOfferState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HuntingOfferState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HuntingOfferState>() {
            public HuntingOfferState findValueByNumber(int number) {
              return HuntingOfferState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HuntingOfferStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final HuntingOfferState[] VALUES = values();

    public static HuntingOfferState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HuntingOfferState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HuntingOfferState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HuntingOfferState.proto*\223\001\n\021HuntingOff" +
      "erState\022\034\n\030HUNTING_OFFER_STATE_NONE\020\000\022\037\n" +
      "\033HUNTING_OFFER_STATE_STARTED\020\001\022!\n\035HUNTIN" +
      "G_OFFER_STATE_UNSTARTED\020\002\022\034\n\030HUNTING_OFF" +
      "ER_STATE_SUCC\020\003B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
