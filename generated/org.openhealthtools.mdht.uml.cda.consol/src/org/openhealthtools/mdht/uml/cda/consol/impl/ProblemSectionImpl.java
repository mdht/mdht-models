/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemSectionImpl#getProblemConcern <em>Problem Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemSectionImpl extends ProblemSectionEntriesOptionalImpl implements ProblemSection {
	/**
	 * The cached value of the '{@link #getProblemConcern() <em>Problem Concern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcern()
	 * @generated
	 * @ordered
	 */
	protected EList<ProblemConcernAct> problemConcern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemConcernAct> getProblemConcern() {
		if (problemConcern == null) {
			problemConcern = new EObjectResolvingEList<ProblemConcernAct>(
				ProblemConcernAct.class, this, ConsolPackage.PROBLEM_SECTION__PROBLEM_CONCERN);
		}
		return problemConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemSectionOperations.validateProblemSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConsolPackage.PROBLEM_SECTION__PROBLEM_CONCERN:
				return getProblemConcern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConsolPackage.PROBLEM_SECTION__PROBLEM_CONCERN:
				getProblemConcern().clear();
				getProblemConcern().addAll((Collection<? extends ProblemConcernAct>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConsolPackage.PROBLEM_SECTION__PROBLEM_CONCERN:
				getProblemConcern().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConsolPackage.PROBLEM_SECTION__PROBLEM_CONCERN:
				return problemConcern != null && !problemConcern.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSection init() {
		CDAUtil.init(this);
		return this;
	}
} // ProblemSectionImpl
