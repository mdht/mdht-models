/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PostoperativeDiagnosisSectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Postoperative Diagnosis Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PostoperativeDiagnosisSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.PostoperativeDiagnosisSectionImpl
		implements PostoperativeDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PostoperativeDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.POSTOPERATIVE_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolPostoperativeDiagnosisSectionProblemObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostoperativeDiagnosisSectionOperations.validateMu2consolPostoperativeDiagnosisSectionProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation getProblemObservation() {
		return PostoperativeDiagnosisSectionOperations.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostoperativeDiagnosisSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PostoperativeDiagnosisSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PostoperativeDiagnosisSectionImpl
