// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JoinRoom.proto

package net.combatserver.protobuf;

public final class JoinRoom {
  private JoinRoom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface JoinDefaultRoomRequestDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  public static final class JoinDefaultRoomRequestData extends
      com.google.protobuf.GeneratedMessage
      implements JoinDefaultRoomRequestDataOrBuilder {
    // Use JoinDefaultRoomRequestData.newBuilder() to construct.
    private JoinDefaultRoomRequestData(Builder builder) {
      super(builder);
    }
    private JoinDefaultRoomRequestData(boolean noInit) {}
    
    private static final JoinDefaultRoomRequestData defaultInstance;
    public static JoinDefaultRoomRequestData getDefaultInstance() {
      return defaultInstance;
    }
    
    public JoinDefaultRoomRequestData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_fieldAccessorTable;
    }
    
    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
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
    
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseDelimitedFrom(
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
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData prototype) {
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
       implements net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_fieldAccessorTable;
      }
      
      // Construct using net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData.newBuilder()
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
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData.getDescriptor();
      }
      
      public net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData getDefaultInstanceForType() {
        return net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData.getDefaultInstance();
      }
      
      public net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData build() {
        net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData buildPartial() {
        net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData result = new net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData(this);
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData) {
          return mergeFrom((net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData other) {
        if (other == net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:net.combatserver.protobuf.JoinDefaultRoomRequestData)
    }
    
    static {
      defaultInstance = new JoinDefaultRoomRequestData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.combatserver.protobuf.JoinDefaultRoomRequestData)
  }
  
  public interface JoinRoomResponseDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .net.combatserver.protobuf.Room room = 1;
    boolean hasRoom();
    net.combatserver.protobuf.DataStructures.Room getRoom();
    net.combatserver.protobuf.DataStructures.RoomOrBuilder getRoomOrBuilder();
  }
  public static final class JoinRoomResponseData extends
      com.google.protobuf.GeneratedMessage
      implements JoinRoomResponseDataOrBuilder {
    // Use JoinRoomResponseData.newBuilder() to construct.
    private JoinRoomResponseData(Builder builder) {
      super(builder);
    }
    private JoinRoomResponseData(boolean noInit) {}
    
    private static final JoinRoomResponseData defaultInstance;
    public static JoinRoomResponseData getDefaultInstance() {
      return defaultInstance;
    }
    
    public JoinRoomResponseData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinRoomResponseData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinRoomResponseData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .net.combatserver.protobuf.Room room = 1;
    public static final int ROOM_FIELD_NUMBER = 1;
    private net.combatserver.protobuf.DataStructures.Room room_;
    public boolean hasRoom() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public net.combatserver.protobuf.DataStructures.Room getRoom() {
      return room_;
    }
    public net.combatserver.protobuf.DataStructures.RoomOrBuilder getRoomOrBuilder() {
      return room_;
    }
    
    private void initFields() {
      room_ = net.combatserver.protobuf.DataStructures.Room.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasRoom()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRoom().isInitialized()) {
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
        output.writeMessage(1, room_);
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
          .computeMessageSize(1, room_);
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
    
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseDelimitedFrom(
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
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.JoinRoom.JoinRoomResponseData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.combatserver.protobuf.JoinRoom.JoinRoomResponseData prototype) {
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
       implements net.combatserver.protobuf.JoinRoom.JoinRoomResponseDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinRoomResponseData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.combatserver.protobuf.JoinRoom.internal_static_net_combatserver_protobuf_JoinRoomResponseData_fieldAccessorTable;
      }
      
      // Construct using net.combatserver.protobuf.JoinRoom.JoinRoomResponseData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRoomFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (roomBuilder_ == null) {
          room_ = net.combatserver.protobuf.DataStructures.Room.getDefaultInstance();
        } else {
          roomBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.combatserver.protobuf.JoinRoom.JoinRoomResponseData.getDescriptor();
      }
      
      public net.combatserver.protobuf.JoinRoom.JoinRoomResponseData getDefaultInstanceForType() {
        return net.combatserver.protobuf.JoinRoom.JoinRoomResponseData.getDefaultInstance();
      }
      
      public net.combatserver.protobuf.JoinRoom.JoinRoomResponseData build() {
        net.combatserver.protobuf.JoinRoom.JoinRoomResponseData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.combatserver.protobuf.JoinRoom.JoinRoomResponseData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.combatserver.protobuf.JoinRoom.JoinRoomResponseData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.combatserver.protobuf.JoinRoom.JoinRoomResponseData buildPartial() {
        net.combatserver.protobuf.JoinRoom.JoinRoomResponseData result = new net.combatserver.protobuf.JoinRoom.JoinRoomResponseData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (roomBuilder_ == null) {
          result.room_ = room_;
        } else {
          result.room_ = roomBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.combatserver.protobuf.JoinRoom.JoinRoomResponseData) {
          return mergeFrom((net.combatserver.protobuf.JoinRoom.JoinRoomResponseData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.combatserver.protobuf.JoinRoom.JoinRoomResponseData other) {
        if (other == net.combatserver.protobuf.JoinRoom.JoinRoomResponseData.getDefaultInstance()) return this;
        if (other.hasRoom()) {
          mergeRoom(other.getRoom());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasRoom()) {
          
          return false;
        }
        if (!getRoom().isInitialized()) {
          
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
              net.combatserver.protobuf.DataStructures.Room.Builder subBuilder = net.combatserver.protobuf.DataStructures.Room.newBuilder();
              if (hasRoom()) {
                subBuilder.mergeFrom(getRoom());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setRoom(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .net.combatserver.protobuf.Room room = 1;
      private net.combatserver.protobuf.DataStructures.Room room_ = net.combatserver.protobuf.DataStructures.Room.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          net.combatserver.protobuf.DataStructures.Room, net.combatserver.protobuf.DataStructures.Room.Builder, net.combatserver.protobuf.DataStructures.RoomOrBuilder> roomBuilder_;
      public boolean hasRoom() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public net.combatserver.protobuf.DataStructures.Room getRoom() {
        if (roomBuilder_ == null) {
          return room_;
        } else {
          return roomBuilder_.getMessage();
        }
      }
      public Builder setRoom(net.combatserver.protobuf.DataStructures.Room value) {
        if (roomBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          room_ = value;
          onChanged();
        } else {
          roomBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setRoom(
          net.combatserver.protobuf.DataStructures.Room.Builder builderForValue) {
        if (roomBuilder_ == null) {
          room_ = builderForValue.build();
          onChanged();
        } else {
          roomBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeRoom(net.combatserver.protobuf.DataStructures.Room value) {
        if (roomBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              room_ != net.combatserver.protobuf.DataStructures.Room.getDefaultInstance()) {
            room_ =
              net.combatserver.protobuf.DataStructures.Room.newBuilder(room_).mergeFrom(value).buildPartial();
          } else {
            room_ = value;
          }
          onChanged();
        } else {
          roomBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearRoom() {
        if (roomBuilder_ == null) {
          room_ = net.combatserver.protobuf.DataStructures.Room.getDefaultInstance();
          onChanged();
        } else {
          roomBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public net.combatserver.protobuf.DataStructures.Room.Builder getRoomBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRoomFieldBuilder().getBuilder();
      }
      public net.combatserver.protobuf.DataStructures.RoomOrBuilder getRoomOrBuilder() {
        if (roomBuilder_ != null) {
          return roomBuilder_.getMessageOrBuilder();
        } else {
          return room_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          net.combatserver.protobuf.DataStructures.Room, net.combatserver.protobuf.DataStructures.Room.Builder, net.combatserver.protobuf.DataStructures.RoomOrBuilder> 
          getRoomFieldBuilder() {
        if (roomBuilder_ == null) {
          roomBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              net.combatserver.protobuf.DataStructures.Room, net.combatserver.protobuf.DataStructures.Room.Builder, net.combatserver.protobuf.DataStructures.RoomOrBuilder>(
                  room_,
                  getParentForChildren(),
                  isClean());
          room_ = null;
        }
        return roomBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:net.combatserver.protobuf.JoinRoomResponseData)
    }
    
    static {
      defaultInstance = new JoinRoomResponseData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.combatserver.protobuf.JoinRoomResponseData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_combatserver_protobuf_JoinRoomResponseData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_combatserver_protobuf_JoinRoomResponseData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016JoinRoom.proto\022\031net.combatserver.proto" +
      "buf\032\024DataStructures.proto\"\034\n\032JoinDefault" +
      "RoomRequestData\"E\n\024JoinRoomResponseData\022" +
      "-\n\004room\030\001 \002(\0132\037.net.combatserver.protobu" +
      "f.RoomB\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_combatserver_protobuf_JoinDefaultRoomRequestData_descriptor,
              new java.lang.String[] { },
              net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData.class,
              net.combatserver.protobuf.JoinRoom.JoinDefaultRoomRequestData.Builder.class);
          internal_static_net_combatserver_protobuf_JoinRoomResponseData_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_net_combatserver_protobuf_JoinRoomResponseData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_combatserver_protobuf_JoinRoomResponseData_descriptor,
              new java.lang.String[] { "Room", },
              net.combatserver.protobuf.JoinRoom.JoinRoomResponseData.class,
              net.combatserver.protobuf.JoinRoom.JoinRoomResponseData.Builder.class);
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
