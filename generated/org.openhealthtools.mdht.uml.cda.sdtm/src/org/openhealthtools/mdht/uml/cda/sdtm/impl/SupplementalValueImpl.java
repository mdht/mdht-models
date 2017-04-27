/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SupplementalValueOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplemental Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SupplementalValueImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements SupplementalValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplementalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.SUPPLEMENTAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueOrigenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueOrigenAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplementalValueStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplementalValueOperations.validateSupplementalValueStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementalValue init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public SupplementalValue init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //SupplementalValueImpl
