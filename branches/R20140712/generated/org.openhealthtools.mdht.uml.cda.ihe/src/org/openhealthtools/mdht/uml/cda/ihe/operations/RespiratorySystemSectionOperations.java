/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Respiratory System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection#validateRespiratorySystemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection#validateRespiratorySystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection#validateRespiratorySystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RespiratorySystemSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespiratorySystemSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRespiratorySystemSectionTemplateId(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratorySystemSectionTemplateId(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPIRATORY_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.30')";

	/**
	 * The cached OCL invariant for the '{@link #validateRespiratorySystemSectionTemplateId(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratorySystemSectionTemplateId(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESPIRATORY_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratorySystemSection The receiving '<em><b>Respiratory System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRespiratorySystemSectionTemplateId(RespiratorySystemSection respiratorySystemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPIRATORY_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.RESPIRATORY_SYSTEM_SECTION);
			try {
				VALIDATE_RESPIRATORY_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPIRATORY_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPIRATORY_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			respiratorySystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.RESPIRATORY_SYSTEM_SECTION__RESPIRATORY_SYSTEM_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("RespiratorySystemSectionTemplateId"),
					new Object[] { respiratorySystemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRespiratorySystemSectionCode(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratorySystemSectionCode(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPIRATORY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11412-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateRespiratorySystemSectionCode(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratorySystemSectionCode(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESPIRATORY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratorySystemSection The receiving '<em><b>Respiratory System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRespiratorySystemSectionCode(RespiratorySystemSection respiratorySystemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPIRATORY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.RESPIRATORY_SYSTEM_SECTION);
			try {
				VALIDATE_RESPIRATORY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPIRATORY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPIRATORY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			respiratorySystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.RESPIRATORY_SYSTEM_SECTION__RESPIRATORY_SYSTEM_SECTION_CODE,
					IHEPlugin.INSTANCE.getString("RespiratorySystemSectionCode"),
					new Object[] { respiratorySystemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRespiratorySystemSectionProblemEntry(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratorySystemSectionProblemEntry(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::ProblemEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateRespiratorySystemSectionProblemEntry(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratorySystemSectionProblemEntry(RespiratorySystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratorySystemSection The receiving '<em><b>Respiratory System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRespiratorySystemSectionProblemEntry(
			RespiratorySystemSection respiratorySystemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.RESPIRATORY_SYSTEM_SECTION);
			try {
				VALIDATE_RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			respiratorySystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.RESPIRATORY_SYSTEM_SECTION__RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY,
					IHEPlugin.INSTANCE.getString("RespiratorySystemSectionProblemEntry"),
					new Object[] { respiratorySystemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntry(RespiratorySystemSection) <em>Get Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(RespiratorySystemSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntry))->asSequence()->any(true).oclAsType(ihe::ProblemEntry)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntry(RespiratorySystemSection) <em>Get Problem Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(RespiratorySystemSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemEntry getProblemEntry(RespiratorySystemSection respiratorySystemSection) {
		if (GET_PROBLEM_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.RESPIRATORY_SYSTEM_SECTION,
				IHEPackage.Literals.RESPIRATORY_SYSTEM_SECTION.getEAllOperations().get(58));
			try {
				GET_PROBLEM_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY__EOCL_QRY);
		return (ProblemEntry) query.evaluate(respiratorySystemSection);
	}

} // RespiratorySystemSectionOperations
