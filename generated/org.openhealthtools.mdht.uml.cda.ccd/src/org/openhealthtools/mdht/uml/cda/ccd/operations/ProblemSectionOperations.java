/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#getProblemActs() <em>Get Problem Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemSectionOperations extends SectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionTemplateId(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionTemplateId(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionTemplateId(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionTemplateId(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSection The receiving '<em><b>Problem Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProblemSectionTemplateId(ProblemSection problemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_SECTION);
			try {
				VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PROBLEM_SECTION__PROBLEM_SECTION_TEMPLATE_ID,
						CCDPlugin.INSTANCE.getString("ProblemSectionProblemSectionTemplateId"),
						new Object[] { problemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionCode(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionCode(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionCode(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionCode(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSection The receiving '<em><b>Problem Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProblemSectionCode(ProblemSection problemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_SECTION);
			try {
				VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			problemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PROBLEM_SECTION__PROBLEM_SECTION_CODE,
						CCDPlugin.INSTANCE.getString("ProblemSectionProblemSectionCode"),
						new Object[] { problemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionTitle(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionTitle(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionTitle(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionTitle(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSection The receiving '<em><b>Problem Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProblemSectionTitle(ProblemSection problemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_SECTION);
			try {
				VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			problemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PROBLEM_SECTION__PROBLEM_SECTION_TITLE,
						CCDPlugin.INSTANCE.getString("ProblemSectionProblemSectionTitle"),
						new Object[] { problemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionText(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionText(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionText(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionText(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSection The receiving '<em><b>Problem Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProblemSectionText(ProblemSection problemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_SECTION);
			try {
				VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			problemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PROBLEM_SECTION__PROBLEM_SECTION_TEXT,
						CCDPlugin.INSTANCE.getString("ProblemSectionProblemSectionText"),
						new Object[] { problemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionProblemAct(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionProblemAct(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ccd::ProblemAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionProblemAct(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionProblemAct(ProblemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSection The receiving '<em><b>Problem Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProblemSectionProblemAct(ProblemSection problemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_SECTION);
			try {
				VALIDATE_PROBLEM_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PROBLEM_SECTION__PROBLEM_SECTION_PROBLEM_ACT,
						CCDPlugin.INSTANCE.getString("ProblemSectionProblemSectionProblemAct"),
						new Object[] { problemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemActs(ProblemSection) <em>Get Problem Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemActs(ProblemSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::ProblemAct)).oclAsType(ccd::ProblemAct)";

	/**
	 * The cached OCL query for the '{@link #getProblemActs(ProblemSection) <em>Get Problem Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemActs(ProblemSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ProblemAct> getProblemActs(ProblemSection problemSection) {

		if (GET_PROBLEM_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.PROBLEM_SECTION, CCDPackage.Literals.PROBLEM_SECTION.getEAllOperations().get(60));
			try {
				GET_PROBLEM_ACTS__EOCL_QRY = helper.createQuery(GET_PROBLEM_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemAct> result = (Collection<ProblemAct>) query.evaluate(problemSection);
		return new BasicEList.UnmodifiableEList<ProblemAct>(result.size(), result.toArray());
	}

} // ProblemSectionOperations
