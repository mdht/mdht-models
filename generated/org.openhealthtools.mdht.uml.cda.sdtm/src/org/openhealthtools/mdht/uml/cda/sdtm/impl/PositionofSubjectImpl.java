/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PositionofSubjectOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positionof Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PositionofSubjectImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PositionofSubject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionofSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.POSITIONOF_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePositionofSubjectTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PositionofSubjectOperations.validatePositionofSubjectTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePositionofSubjectClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PositionofSubjectOperations.validatePositionofSubjectClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePositionofSubjectMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PositionofSubjectOperations.validatePositionofSubjectMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePositionofSubjectCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PositionofSubjectOperations.validatePositionofSubjectCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePositionofSubjectCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PositionofSubjectOperations.validatePositionofSubjectCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePositionofSubjectValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PositionofSubjectOperations.validatePositionofSubjectValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePositionofSubjectValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PositionofSubjectOperations.validatePositionofSubjectValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionofSubject init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PositionofSubject init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //PositionofSubjectImpl
