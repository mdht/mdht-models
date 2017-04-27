/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.CardiacFunctionObservation;
import org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ResultsSectionBCTPSOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultsSectionEntriesOptionalImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResultsSectionBCTPSImpl extends ResultsSectionEntriesOptionalImpl implements ResultsSectionBCTPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsSectionBCTPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getResultsSectionBCTPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptorStatusOrganizer getReceptorStatusOrganizer() {
		return ResultsSectionBCTPSOperations.getReceptorStatusOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacFunctionObservation getCardiacFunctionObservation() {
		return ResultsSectionBCTPSOperations.getCardiacFunctionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultsSectionBCTPSOperations.validateResultsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSectionBCTPS init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ResultsSectionBCTPSImpl
