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
import org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore;
import org.openhealthtools.mdht.uml.cda.clondata.operations.OncotypeDXScoreOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oncotype DX Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OncotypeDXScoreImpl extends ResultObservationImpl implements OncotypeDXScore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OncotypeDXScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getOncotypeDXScore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScoreCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OncotypeDXScoreOperations.validateOncotypeDXScoreCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScoreCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OncotypeDXScoreOperations.validateOncotypeDXScoreCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScoreStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OncotypeDXScoreOperations.validateOncotypeDXScoreStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScoreStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OncotypeDXScoreOperations.validateOncotypeDXScoreStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScoreValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OncotypeDXScoreOperations.validateOncotypeDXScoreValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OncotypeDXScoreOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OncotypeDXScore init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OncotypeDXScore init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // OncotypeDXScoreImpl
