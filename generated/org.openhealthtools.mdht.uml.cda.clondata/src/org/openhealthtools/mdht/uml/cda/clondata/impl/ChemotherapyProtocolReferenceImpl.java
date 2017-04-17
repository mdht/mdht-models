/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ChemotherapyProtocolReferenceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chemotherapy Protocol Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChemotherapyProtocolReferenceImpl extends ActImpl implements ChemotherapyProtocolReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChemotherapyProtocolReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceReferenceExternalDocumentId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceReferenceExternalDocumentText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceReferenceExternalDocumentText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceReferenceTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReferenceReferenceExternalDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyProtocolReferenceOperations.validateChemotherapyProtocolReferenceReferenceExternalDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyProtocolReference init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyProtocolReference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ChemotherapyProtocolReferenceImpl
