// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NewUser.proto

package net.combatserver.protobuf;

public final class NewUser {
  private NewUser() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface NewUserNoticeDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .net.combatserver.protobuf.User user = 1;
    boolean hasUser();
    net.combatserver.protobuf.DataStructures.User getUser();
    net.combatserver.protobuf.DataStructures.UserOrBuilder getUserOrBuilder();
  }
  public static final class NewUserNoticeData extends
      com.google.protobuf.GeneratedMessage
      implements NewUserNoticeDataOrBuilder {
    // Use NewUserNoticeData.newBuilder() to construct.
    private NewUserNoticeData(Builder builder) {
      super(builder);
    }
    private NewUserNoticeData(boolean noInit) {}
    
    private static final NewUserNoticeData defaultInstance;
    public static NewUserNoticeData getDefaultInstance() {
      return defaultInstance;
    }
    
    public NewUserNoticeData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.combatserver.protobuf.NewUser.internal_static_net_combatserver_protobuf_NewUserNoticeData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.combatserver.protobuf.NewUser.internal_static_net_combatserver_protobuf_NewUserNoticeData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .net.combatserver.protobuf.User user = 1;
    public static final int USER_FIELD_NUMBER = 1;
    private net.combatserver.protobuf.DataStructures.User user_;
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public net.combatserver.protobuf.DataStructures.User getUser() {
      return user_;
    }
    public net.combatserver.protobuf.DataStructures.UserOrBuilder getUserOrBuilder() {
      return user_;
    }
    
    private void initFields() {
      user_ = net.combatserver.protobuf.DataStructures.User.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasUser()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getUser().isInitialized()) {
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
        output.writeMessage(1, user_);
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
          .computeMessageSize(1, user_);
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
    
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseDelimitedFrom(
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
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.NewUser.NewUserNoticeData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.combatserver.protobuf.NewUser.NewUserNoticeData prototype) {
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
       implements net.combatserver.protobuf.NewUser.NewUserNoticeDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.combatserver.protobuf.NewUser.internal_static_net_combatserver_protobuf_NewUserNoticeData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.combatserver.protobuf.NewUser.internal_static_net_combatserver_protobuf_NewUserNoticeData_fieldAccessorTable;
      }
      
      // Construct using net.combatserver.protobuf.NewUser.NewUserNoticeData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getUserFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (userBuilder_ == null) {
          user_ = net.combatserver.protobuf.DataStructures.User.getDefaultInstance();
        } else {
          userBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.combatserver.protobuf.NewUser.NewUserNoticeData.getDescriptor();
      }
      
      public net.combatserver.protobuf.NewUser.NewUserNoticeData getDefaultInstanceForType() {
        return net.combatserver.protobuf.NewUser.NewUserNoticeData.getDefaultInstance();
      }
      
      public net.combatserver.protobuf.NewUser.NewUserNoticeData build() {
        net.combatserver.protobuf.NewUser.NewUserNoticeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.combatserver.protobuf.NewUser.NewUserNoticeData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.combatserver.protobuf.NewUser.NewUserNoticeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.combatserver.protobuf.NewUser.NewUserNoticeData buildPartial() {
        net.combatserver.protobuf.NewUser.NewUserNoticeData result = new net.combatserver.protobuf.NewUser.NewUserNoticeData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.combatserver.protobuf.NewUser.NewUserNoticeData) {
          return mergeFrom((net.combatserver.protobuf.NewUser.NewUserNoticeData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.combatserver.protobuf.NewUser.NewUserNoticeData other) {
        if (other == net.combatserver.protobuf.NewUser.NewUserNoticeData.getDefaultInstance()) return this;
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasUser()) {
          
          return false;
        }
        if (!getUser().isInitialized()) {
          
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
              net.combatserver.protobuf.DataStructures.User.Builder subBuilder = net.combatserver.protobuf.DataStructures.User.newBuilder();
              if (hasUser()) {
                subBuilder.mergeFrom(getUser());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setUser(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .net.combatserver.protobuf.User user = 1;
      private net.combatserver.protobuf.DataStructures.User user_ = net.combatserver.protobuf.DataStructures.User.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          net.combatserver.protobuf.DataStructures.User, net.combatserver.protobuf.DataStructures.User.Builder, net.combatserver.protobuf.DataStructures.UserOrBuilder> userBuilder_;
      public boolean hasUser() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public net.combatserver.protobuf.DataStructures.User getUser() {
        if (userBuilder_ == null) {
          return user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      public Builder setUser(net.combatserver.protobuf.DataStructures.User value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setUser(
          net.combatserver.protobuf.DataStructures.User.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeUser(net.combatserver.protobuf.DataStructures.User value) {
        if (userBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              user_ != net.combatserver.protobuf.DataStructures.User.getDefaultInstance()) {
            user_ =
              net.combatserver.protobuf.DataStructures.User.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = net.combatserver.protobuf.DataStructures.User.getDefaultInstance();
          onChanged();
        } else {
          userBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public net.combatserver.protobuf.DataStructures.User.Builder getUserBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      public net.combatserver.protobuf.DataStructures.UserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          net.combatserver.protobuf.DataStructures.User, net.combatserver.protobuf.DataStructures.User.Builder, net.combatserver.protobuf.DataStructures.UserOrBuilder> 
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              net.combatserver.protobuf.DataStructures.User, net.combatserver.protobuf.DataStructures.User.Builder, net.combatserver.protobuf.DataStructures.UserOrBuilder>(
                  user_,
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:net.combatserver.protobuf.NewUserNoticeData)
    }
    
    static {
      defaultInstance = new NewUserNoticeData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.combatserver.protobuf.NewUserNoticeData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_combatserver_protobuf_NewUserNoticeData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_combatserver_protobuf_NewUserNoticeData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rNewUser.proto\022\031net.combatserver.protob" +
      "uf\032\024DataStructures.proto\"B\n\021NewUserNotic" +
      "eData\022-\n\004user\030\001 \002(\0132\037.net.combatserver.p" +
      "rotobuf.UserB\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_combatserver_protobuf_NewUserNoticeData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_combatserver_protobuf_NewUserNoticeData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_combatserver_protobuf_NewUserNoticeData_descriptor,
              new java.lang.String[] { "User", },
              net.combatserver.protobuf.NewUser.NewUserNoticeData.class,
              net.combatserver.protobuf.NewUser.NewUserNoticeData.Builder.class);
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