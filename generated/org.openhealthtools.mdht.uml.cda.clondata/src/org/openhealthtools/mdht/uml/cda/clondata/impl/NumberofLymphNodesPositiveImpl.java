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
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive;
import org.openhealthtools.mdht.uml.cda.clondata.operations.NumberofLymphNodesPositiveOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numberof Lymph Nodes Positive</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NumberofLymphNodesPositiveImpl extends ResultObservationImpl implements NumberofLymphNodesPositive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberofLymphNodesPositiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getNumberofLymphNodesPositive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositiveCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLymphNodesPositiveOperations.validateNumberofLymphNodesPositiveCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositiveCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLymphNodesPositiveOperations.validateNumberofLymphNodesPositiveCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositiveValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLymphNodesPositiveOperations.validateNumberofLymphNodesPositiveValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLymphNodesPositiveOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberofLymphNodesPositive init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberofLymphNodesPositive init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NumberofLymphNodesPositiveImpl
