// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConverters._

/** Describes an enum type.
  */
@SerialVersionUID(0L)
final case class EnumDescriptorProto(
    name: scala.Option[String] = None,
    value: scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto] = Nil,
    options: scala.Option[com.google.protobuf.descriptor.EnumOptions] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EnumDescriptorProto] with com.trueaccord.lenses.Updatable[EnumDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      value.foreach(value => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.serializedSize) + value.serializedSize)
      if (options.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      name.foreach { __v =>
        _output__.writeString(1, __v)
      };
      value.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      options.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumDescriptorProto = {
      var __name = this.name
      val __value = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.EnumValueDescriptorProto] ++= this.value)
      var __options = this.options
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 18 =>
            __value += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.EnumValueDescriptorProto.defaultInstance)
          case 26 =>
            __options = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.EnumOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.EnumDescriptorProto(
          name = __name,
          value = __value.result(),
          options = __options
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: EnumDescriptorProto = copy(name = None)
    def withName(__v: String): EnumDescriptorProto = copy(name = Some(__v))
    def clearValue = copy(value = scala.collection.Seq.empty)
    def addValue(__vs: com.google.protobuf.descriptor.EnumValueDescriptorProto*): EnumDescriptorProto = addAllValue(__vs)
    def addAllValue(__vs: TraversableOnce[com.google.protobuf.descriptor.EnumValueDescriptorProto]): EnumDescriptorProto = copy(value = value ++ __vs)
    def withValue(__v: scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]): EnumDescriptorProto = copy(value = __v)
    def getOptions: com.google.protobuf.descriptor.EnumOptions = options.getOrElse(com.google.protobuf.descriptor.EnumOptions.defaultInstance)
    def clearOptions: EnumDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.EnumOptions): EnumDescriptorProto = copy(options = Some(__v))
    def getField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => name.orNull
        case 2 => value
        case 3 => options.orNull
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.EnumDescriptorProto
}

object EnumDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumDescriptorProto, com.google.protobuf.DescriptorProtos.EnumDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumDescriptorProto, com.google.protobuf.DescriptorProtos.EnumDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.EnumDescriptorProto): com.google.protobuf.DescriptorProtos.EnumDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    javaPbOut.addAllValue(scalaPbSource.value.map(com.google.protobuf.descriptor.EnumValueDescriptorProto.toJavaProto(_)).asJava)
    scalaPbSource.options.map(com.google.protobuf.descriptor.EnumOptions.toJavaProto(_)).foreach(javaPbOut.setOptions)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.EnumDescriptorProto): com.google.protobuf.descriptor.EnumDescriptorProto = com.google.protobuf.descriptor.EnumDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else None,
    value = javaPbSource.getValueList.asScala.map(com.google.protobuf.descriptor.EnumValueDescriptorProto.fromJavaProto(_)),
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.EnumOptions.fromJavaProto(javaPbSource.getOptions)) else None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.EnumDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.EnumDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.EnumOptions]]
    )
  }
  def descriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(5)
  def messageCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 2 => __out = com.google.protobuf.descriptor.EnumValueDescriptorProto
      case 3 => __out = com.google.protobuf.descriptor.EnumOptions
    }
  __out
  }
  def enumCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumDescriptorProto(
  )
  implicit class EnumDescriptorProtoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto](_l) {
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def value: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    def options: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.EnumOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
}