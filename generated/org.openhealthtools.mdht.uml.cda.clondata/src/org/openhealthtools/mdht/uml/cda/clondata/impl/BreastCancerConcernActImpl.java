/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerConcernAct;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BreastCancerConcernActOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ProblemConcernActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breast Cancer Concern Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BreastCancerConcernActImpl extends ProblemConcernActImpl implements BreastCancerConcernAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreastCancerConcernActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBreastCancerConcernAct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastCancerConcernActOperations.validateProblemConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreastCancerConcernAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreastCancerConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BreastCancerConcernActImpl
