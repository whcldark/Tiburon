// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetZone.proto

package net.combatserver.protobuf;

public final class GetZone {
  private GetZone() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetZoneRequestDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 zoneid = 1;
    boolean hasZoneid();
    int getZoneid();
  }
  public static final class GetZoneRequestData extends
      com.google.protobuf.GeneratedMessage
      implements GetZoneRequestDataOrBuilder {
    // Use GetZoneRequestData.newBuilder() to construct.
    private GetZoneRequestData(Builder builder) {
      super(builder);
    }
    private GetZoneRequestData(boolean noInit) {}
    
    private static final GetZoneRequestData defaultInstance;
    public static GetZoneRequestData getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetZoneRequestData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneRequestData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneRequestData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 zoneid = 1;
    public static final int ZONEID_FIELD_NUMBER = 1;
    private int zoneid_;
    public boolean hasZoneid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getZoneid() {
      return zoneid_;
    }
    
    private void initFields() {
      zoneid_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasZoneid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, zoneid_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, zoneid_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneRequestData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.combatserver.protobuf.GetZone.GetZoneRequestData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.combatserver.protobuf.GetZone.GetZoneRequestDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneRequestData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneRequestData_fieldAccessorTable;
      }
      
      // Construct using net.combatserver.protobuf.GetZone.GetZoneRequestData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        zoneid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.combatserver.protobuf.GetZone.GetZoneRequestData.getDescriptor();
      }
      
      public net.combatserver.protobuf.GetZone.GetZoneRequestData getDefaultInstanceForType() {
        return net.combatserver.protobuf.GetZone.GetZoneRequestData.getDefaultInstance();
      }
      
      public net.combatserver.protobuf.GetZone.GetZoneRequestData build() {
        net.combatserver.protobuf.GetZone.GetZoneRequestData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.combatserver.protobuf.GetZone.GetZoneRequestData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.combatserver.protobuf.GetZone.GetZoneRequestData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.combatserver.protobuf.GetZone.GetZoneRequestData buildPartial() {
        net.combatserver.protobuf.GetZone.GetZoneRequestData result = new net.combatserver.protobuf.GetZone.GetZoneRequestData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.zoneid_ = zoneid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.combatserver.protobuf.GetZone.GetZoneRequestData) {
          return mergeFrom((net.combatserver.protobuf.GetZone.GetZoneRequestData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.combatserver.protobuf.GetZone.GetZoneRequestData other) {
        if (other == net.combatserver.protobuf.GetZone.GetZoneRequestData.getDefaultInstance()) return this;
        if (other.hasZoneid()) {
          setZoneid(other.getZoneid());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasZoneid()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              zoneid_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 zoneid = 1;
      private int zoneid_ ;
      public boolean hasZoneid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getZoneid() {
        return zoneid_;
      }
      public Builder setZoneid(int value) {
        bitField0_ |= 0x00000001;
        zoneid_ = value;
        onChanged();
        return this;
      }
      public Builder clearZoneid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        zoneid_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.combatserver.protobuf.GetZoneRequestData)
    }
    
    static {
      defaultInstance = new GetZoneRequestData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.combatserver.protobuf.GetZoneRequestData)
  }
  
  public interface GetZoneResponseDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .net.combatserver.protobuf.Zone zone = 1;
    boolean hasZone();
    net.combatserver.protobuf.DataStructures.Zone getZone();
    net.combatserver.protobuf.DataStructures.ZoneOrBuilder getZoneOrBuilder();
  }
  public static final class GetZoneResponseData extends
      com.google.protobuf.GeneratedMessage
      implements GetZoneResponseDataOrBuilder {
    // Use GetZoneResponseData.newBuilder() to construct.
    private GetZoneResponseData(Builder builder) {
      super(builder);
    }
    private GetZoneResponseData(boolean noInit) {}
    
    private static final GetZoneResponseData defaultInstance;
    public static GetZoneResponseData getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetZoneResponseData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneResponseData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneResponseData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .net.combatserver.protobuf.Zone zone = 1;
    public static final int ZONE_FIELD_NUMBER = 1;
    private net.combatserver.protobuf.DataStructures.Zone zone_;
    public boolean hasZone() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public net.combatserver.protobuf.DataStructures.Zone getZone() {
      return zone_;
    }
    public net.combatserver.protobuf.DataStructures.ZoneOrBuilder getZoneOrBuilder() {
      return zone_;
    }
    
    private void initFields() {
      zone_ = net.combatserver.protobuf.DataStructures.Zone.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasZone()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getZone().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, zone_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, zone_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.GetZone.GetZoneResponseData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.combatserver.protobuf.GetZone.GetZoneResponseData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.combatserver.protobuf.GetZone.GetZoneResponseDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneResponseData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.combatserver.protobuf.GetZone.internal_static_net_combatserver_protobuf_GetZoneResponseData_fieldAccessorTable;
      }
      
      // Construct using net.combatserver.protobuf.GetZone.GetZoneResponseData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getZoneFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (zoneBuilder_ == null) {
          zone_ = net.combatserver.protobuf.DataStructures.Zone.getDefaultInstance();
        } else {
          zoneBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.combatserver.protobuf.GetZone.GetZoneResponseData.getDescriptor();
      }
      
      public net.combatserver.protobuf.GetZone.GetZoneResponseData getDefaultInstanceForType() {
        return net.combatserver.protobuf.GetZone.GetZoneResponseData.getDefaultInstance();
      }
      
      public net.combatserver.protobuf.GetZone.GetZoneResponseData build() {
        net.combatserver.protobuf.GetZone.GetZoneResponseData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.combatserver.protobuf.GetZone.GetZoneResponseData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.combatserver.protobuf.GetZone.GetZoneResponseData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.combatserver.protobuf.GetZone.GetZoneResponseData buildPartial() {
        net.combatserver.protobuf.GetZone.GetZoneResponseData result = new net.combatserver.protobuf.GetZone.GetZoneResponseData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (zoneBuilder_ == null) {
          result.zone_ = zone_;
        } else {
          result.zone_ = zoneBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.combatserver.protobuf.GetZone.GetZoneResponseData) {
          return mergeFrom((net.combatserver.protobuf.GetZone.GetZoneResponseData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.combatserver.protobuf.GetZone.GetZoneResponseData other) {
        if (other == net.combatserver.protobuf.GetZone.GetZoneResponseData.getDefaultInstance()) return this;
        if (other.hasZone()) {
          mergeZone(other.getZone());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasZone()) {
          
          return false;
        }
        if (!getZone().isInitialized()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              net.combatserver.protobuf.DataStructures.Zone.Builder subBuilder = net.combatserver.protobuf.DataStructures.Zone.newBuilder();
              if (hasZone()) {
                subBuilder.mergeFrom(getZone());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setZone(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .net.combatserver.protobuf.Zone zone = 1;
      private net.combatserver.protobuf.DataStructures.Zone zone_ = net.combatserver.protobuf.DataStructures.Zone.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          net.combatserver.protobuf.DataStructures.Zone, net.combatserver.protobuf.DataStructures.Zone.Builder, net.combatserver.protobuf.DataStructures.ZoneOrBuilder> zoneBuilder_;
      public boolean hasZone() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public net.combatserver.protobuf.DataStructures.Zone getZone() {
        if (zoneBuilder_ == null) {
          return zone_;
        } else {
          return zoneBuilder_.getMessage();
        }
      }
      public Builder setZone(net.combatserver.protobuf.DataStructures.Zone value) {
        if (zoneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          zone_ = value;
          onChanged();
        } else {
          zoneBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setZone(
          net.combatserver.protobuf.DataStructures.Zone.Builder builderForValue) {
        if (zoneBuilder_ == null) {
          zone_ = builderForValue.build();
          onChanged();
        } else {
          zoneBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeZone(net.combatserver.protobuf.DataStructures.Zone value) {
        if (zoneBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              zone_ != net.combatserver.protobuf.DataStructures.Zone.getDefaultInstance()) {
            zone_ =
              net.combatserver.protobuf.DataStructures.Zone.newBuilder(zone_).mergeFrom(value).buildPartial();
          } else {
            zone_ = value;
          }
          onChanged();
        } else {
          zoneBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearZone() {
        if (zoneBuilder_ == null) {
          zone_ = net.combatserver.protobuf.DataStructures.Zone.getDefaultInstance();
          onChanged();
        } else {
          zoneBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public net.combatserver.protobuf.DataStructures.Zone.Builder getZoneBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getZoneFieldBuilder().getBuilder();
      }
      public net.combatserver.protobuf.DataStructures.ZoneOrBuilder getZoneOrBuilder() {
        if (zoneBuilder_ != null) {
          return zoneBuilder_.getMessageOrBuilder();
        } else {
          return zone_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          net.combatserver.protobuf.DataStructures.Zone, net.combatserver.protobuf.DataStructures.Zone.Builder, net.combatserver.protobuf.DataStructures.ZoneOrBuilder> 
          getZoneFieldBuilder() {
        if (zoneBuilder_ == null) {
          zoneBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              net.combatserver.protobuf.DataStructures.Zone, net.combatserver.protobuf.DataStructures.Zone.Builder, net.combatserver.protobuf.DataStructures.ZoneOrBuilder>(
                  zone_,
                  getParentForChildren(),
                  isClean());
          zone_ = null;
        }
        return zoneBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:net.combatserver.protobuf.GetZoneResponseData)
    }
    
    static {
      defaultInstance = new GetZoneResponseData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.combatserver.protobuf.GetZoneResponseData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_combatserver_protobuf_GetZoneRequestData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_combatserver_protobuf_GetZoneRequestData_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_combatserver_protobuf_GetZoneResponseData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_combatserver_protobuf_GetZoneResponseData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rGetZone.proto\022\031net.combatserver.protob" +
      "uf\032\024DataStructures.proto\"$\n\022GetZoneReque" +
      "stData\022\016\n\006zoneid\030\001 \002(\005\"D\n\023GetZoneRespons" +
      "eData\022-\n\004zone\030\001 \002(\0132\037.net.combatserver.p" +
      "rotobuf.ZoneB\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_combatserver_protobuf_GetZoneRequestData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_combatserver_protobuf_GetZoneRequestData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_combatserver_protobuf_GetZoneRequestData_descriptor,
              new java.lang.String[] { "Zoneid", },
              net.combatserver.protobuf.GetZone.GetZoneRequestData.class,
              net.combatserver.protobuf.GetZone.GetZoneRequestData.Builder.class);
          internal_static_net_combatserver_protobuf_GetZoneResponseData_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_net_combatserver_protobuf_GetZoneResponseData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_combatserver_protobuf_GetZoneResponseData_descriptor,
              new java.lang.String[] { "Zone", },
              net.combatserver.protobuf.GetZone.GetZoneResponseData.class,
              net.combatserver.protobuf.GetZone.GetZoneResponseData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          net.combatserver.protobuf.DataStructures.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}