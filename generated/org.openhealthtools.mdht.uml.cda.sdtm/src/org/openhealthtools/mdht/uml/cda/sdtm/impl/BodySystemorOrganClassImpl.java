/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodySystemorOrganClassOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Systemor Organ Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BodySystemorOrganClassImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements BodySystemorOrganClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodySystemorOrganClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodySystemorOrganClassTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySystemorOrganClassOperations.validateBodySystemorOrganClassTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodySystemorOrganClassClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySystemorOrganClassOperations.validateBodySystemorOrganClassClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodySystemorOrganClassMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySystemorOrganClassOperations.validateBodySystemorOrganClassMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodySystemorOrganClassCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySystemorOrganClassOperations.validateBodySystemorOrganClassCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodySystemorOrganClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySystemorOrganClassOperations.validateBodySystemorOrganClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodySystemorOrganClassValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySystemorOrganClassOperations.validateBodySystemorOrganClassValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodySystemorOrganClassValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySystemorOrganClassOperations.validateBodySystemorOrganClassValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public BodySystemorOrganClass init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //BodySystemorOrganClassImpl
