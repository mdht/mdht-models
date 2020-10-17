/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2;
import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocument2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Document2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnstructuredDocument2Impl extends USRealmHeader2Impl implements UnstructuredDocument2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocument2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2RecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2RecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2Custodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2Custodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2Component(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2Component(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2RecordTargetPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2RecordTargetPatientRoleId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2RecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2RecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2CustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2CustodianAssignedCustodian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2ComponentNonXMLBodyText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument2ComponentNonXMLBody(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBody(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateUSRealmHeader2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocument2Operations.validateUSRealmHeader2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // UnstructuredDocument2Impl
