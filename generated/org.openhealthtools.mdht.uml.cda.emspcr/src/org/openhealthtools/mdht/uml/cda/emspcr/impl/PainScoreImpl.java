/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PainScore;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PainScoreOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pain Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PainScoreImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PainScore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PainScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PAIN_SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePainScoreTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PainScoreOperations.validatePainScoreTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePainScoreMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PainScoreOperations.validatePainScoreMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePainScoreCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PainScoreOperations.validatePainScoreCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePainScoreEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PainScoreOperations.validatePainScoreEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PainScore init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PainScore init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PainScoreImpl
