/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.toc.Condition;
import org.openhealthtools.mdht.uml.cda.toc.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.toc.TOCPackage;

import org.openhealthtools.mdht.uml.cda.toc.operations.ProblemListSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem List Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProblemListSectionImpl extends SectionImpl implements ProblemListSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemListSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOCPackage.Literals.PROBLEM_LIST_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemListSectionOperations.validateProblemListSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemListSectionOperations.validateProblemListSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemListSectionOperations.validateProblemListSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemListSectionOperations.validateProblemListSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		return ProblemListSectionOperations.getConditions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ProblemListSectionImpl
