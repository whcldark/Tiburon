// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PrivateMessage.proto

package net.combatserver.protobuf;

public final class PrivateMessage {
  private PrivateMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PrivateMessageRequestDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string message = 1;
    boolean hasMessage();
    String getMessage();
    
    // required int32 userid = 2;
    boolean hasUserid();
    int getUserid();
  }
  public static final class PrivateMessageRequestData extends
      com.google.protobuf.GeneratedMessage
      implements PrivateMessageRequestDataOrBuilder {
    // Use PrivateMessageRequestData.newBuilder() to construct.
    private PrivateMessageRequestData(Builder builder) {
      super(builder);
    }
    private PrivateMessageRequestData(boolean noInit) {}
    
    private static final PrivateMessageRequestData defaultInstance;
    public static PrivateMessageRequestData getDefaultInstance() {
      return defaultInstance;
    }
    
    public PrivateMessageRequestData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.combatserver.protobuf.PrivateMessage.internal_static_net_combatserver_protobuf_PrivateMessageRequestData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.combatserver.protobuf.PrivateMessage.internal_static_net_combatserver_protobuf_PrivateMessageRequestData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string message = 1;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          message_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 userid = 2;
    public static final int USERID_FIELD_NUMBER = 2;
    private int userid_;
    public boolean hasUserid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getUserid() {
      return userid_;
    }
    
    private void initFields() {
      message_ = "";
      userid_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserid()) {
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
        output.writeBytes(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, userid_);
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
          .computeBytesSize(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, userid_);
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
    
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseDelimitedFrom(
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
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData prototype) {
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
       implements net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.combatserver.protobuf.PrivateMessage.internal_static_net_combatserver_protobuf_PrivateMessageRequestData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.combatserver.protobuf.PrivateMessage.internal_static_net_combatserver_protobuf_PrivateMessageRequestData_fieldAccessorTable;
      }
      
      // Construct using net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData.newBuilder()
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
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        userid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData.getDescriptor();
      }
      
      public net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData getDefaultInstanceForType() {
        return net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData.getDefaultInstance();
      }
      
      public net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData build() {
        net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData buildPartial() {
        net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData result = new net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userid_ = userid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData) {
          return mergeFrom((net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData other) {
        if (other == net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData.getDefaultInstance()) return this;
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        if (other.hasUserid()) {
          setUserid(other.getUserid());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMessage()) {
          
          return false;
        }
        if (!hasUserid()) {
          
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
              bitField0_ |= 0x00000001;
              message_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              userid_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string message = 1;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMessage(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
      }
      
      // required int32 userid = 2;
      private int userid_ ;
      public boolean hasUserid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getUserid() {
        return userid_;
      }
      public Builder setUserid(int value) {
        bitField0_ |= 0x00000002;
        userid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userid_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.combatserver.protobuf.PrivateMessageRequestData)
    }
    
    static {
      defaultInstance = new PrivateMessageRequestData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.combatserver.protobuf.PrivateMessageRequestData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_combatserver_protobuf_PrivateMessageRequestData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_combatserver_protobuf_PrivateMessageRequestData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024PrivateMessage.proto\022\031net.combatserver" +
      ".protobuf\"<\n\031PrivateMessageRequestData\022\017" +
      "\n\007message\030\001 \002(\t\022\016\n\006userid\030\002 \002(\005B\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_combatserver_protobuf_PrivateMessageRequestData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_combatserver_protobuf_PrivateMessageRequestData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_combatserver_protobuf_PrivateMessageRequestData_descriptor,
              new java.lang.String[] { "Message", "Userid", },
              net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData.class,
              net.combatserver.protobuf.PrivateMessage.PrivateMessageRequestData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
