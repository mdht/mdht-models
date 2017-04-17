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
import org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod;
import org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ProblemSectionBCTPSOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ProblemSectionEntriesOptionalImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemSectionBCTPSImpl extends ProblemSectionEntriesOptionalImpl implements ProblemSectionBCTPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSectionBCTPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionBCTPSBreastCancerConcernAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemSectionBCTPSOperations.validateProblemSectionBCTPSBreastCancerConcernAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionBCTPSLastMenstrualPeriod(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemSectionBCTPSOperations.validateProblemSectionBCTPSLastMenstrualPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastCancerConcernAct getBreastCancerConcernAct() {
		return ProblemSectionBCTPSOperations.getBreastCancerConcernAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastMenstrualPeriod getLastMenstrualPeriod() {
		return ProblemSectionBCTPSOperations.getLastMenstrualPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemSectionBCTPSOperations.validateProblemSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSectionBCTPS init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemSectionBCTPSImpl
