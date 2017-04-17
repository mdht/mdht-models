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
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined;
import org.openhealthtools.mdht.uml.cda.clondata.operations.NumberofLymphNodesRemovedandExaminedOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numberof Lymph Nodes Removedand Examined</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NumberofLymphNodesRemovedandExaminedImpl extends ResultObservationImpl
		implements NumberofLymphNodesRemovedandExamined {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberofLymphNodesRemovedandExaminedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getNumberofLymphNodesRemovedandExamined();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExaminedCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberofLymphNodesRemovedandExaminedOperations.validateNumberofLymphNodesRemovedandExaminedCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExaminedCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberofLymphNodesRemovedandExaminedOperations.validateNumberofLymphNodesRemovedandExaminedCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExaminedValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberofLymphNodesRemovedandExaminedOperations.validateNumberofLymphNodesRemovedandExaminedValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberofLymphNodesRemovedandExaminedOperations.validateResultObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberofLymphNodesRemovedandExamined init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberofLymphNodesRemovedandExamined init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NumberofLymphNodesRemovedandExaminedImpl
