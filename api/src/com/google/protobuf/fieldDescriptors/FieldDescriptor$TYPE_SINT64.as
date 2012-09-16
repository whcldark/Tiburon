// vim: tabstop=4 shiftwidth=4

// Copyright (c) 2011 , Yang Bo All rights reserved.
//
// Author: Yang Bo (pop.atry@gmail.com)
//
// Use, modification and distribution are subject to the "New BSD License"
// as listed at <url: http://www.opensource.org/licenses/bsd-license.php >.

package com.google.protobuf.fieldDescriptors {
	import com.google.protobuf.*
	import flash.utils.*
	/**
	 * @private
	 */
	public final class FieldDescriptor$TYPE_SINT64 extends
			FieldDescriptor {
		public function FieldDescriptor$TYPE_SINT64(
				fullName:String, name:String, tag:uint) {
			this.fullName = fullName
			this.name = name
			this.tag = tag
		}
		override public function get type():Class {
			return Int64
		}
		override public function readSingleField(input:IDataInput):* {
			return ReadUtils.read$TYPE_SINT64(input)
		}
		override public function writeSingleField(output:WritingBuffer,
				value:*):void {
			WriteUtils.write$TYPE_SINT64(output, value)
		}
	}
}
