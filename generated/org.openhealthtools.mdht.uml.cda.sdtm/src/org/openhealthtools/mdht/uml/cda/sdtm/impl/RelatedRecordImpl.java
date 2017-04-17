/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.RelatedRecordOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RelatedRecordImpl extends org.eclipse.mdht.uml.cda.impl.ActImpl implements RelatedRecord {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.RELATED_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRelatedRecordTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RelatedRecordOperations.validateRelatedRecordTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRelatedRecordClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RelatedRecordOperations.validateRelatedRecordClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRelatedRecordMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RelatedRecordOperations.validateRelatedRecordMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRelatedRecordId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RelatedRecordOperations.validateRelatedRecordId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRelatedRecordCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RelatedRecordOperations.validateRelatedRecordCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRelatedRecordCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RelatedRecordOperations.validateRelatedRecordCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedRecord init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public RelatedRecord init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //RelatedRecordImpl
