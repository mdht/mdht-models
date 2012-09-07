/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AAAAA</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getAAAAA()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AAAAARecordTarget AAAAAComponent2StructuredBodyComponent3SectionCode AAAAAComponent2StructuredBodyComponent3Section' constraints.validation.query='AAAAAComponent2StructuredBodyComponent3SectionCode AAAAAComponent2StructuredBodyComponent3Section'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAAAAARecordTarget contextControlCode='OP' constraints.validation.error='RecordTargetContextControlCode RecordTargetNullFlavor RecordTargetRealmCode RecordTargetTemplateId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAAAAAComponent2 constraints.validation.error='Component2StructuredBodyComponent3SectionCode Component2StructuredBodyComponent3Section' constraints.validation.query='Component2StructuredBodyComponent3SectionCode Component2StructuredBodyComponent3Section'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAAAAAComponent2StructuredBodyComponent3 constraints.validation.error='Component3Section Component3SectionCode' constraints.validation.query='Component3SectionCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrAAAAAComponent2StructuredBodyComponent3Section constraints.validation.error='SectionCode'"
 * @generated
 */
public interface AAAAA extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateAAAAARecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->select(typeCode=vocab::ParticipationType::CST).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAAAAAComponent2StructuredBodyComponent3SectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->select(typeCode=vocab::ParticipationType::CST).structuredBody->excluding(null).component->excluding(null)->reject(section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->select(typeCode=vocab::ParticipationType::CST)->size() = 1)'"
	 * @generated
	 */
	boolean validateAAAAAComponent2StructuredBodyComponent3Section(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAAAA init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAAAA init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AAAAA
