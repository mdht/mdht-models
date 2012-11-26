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
import org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ears Nose Mouth Throat Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#validateEarsNoseMouthThroatSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#validateEarsNoseMouthThroatSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#validateEarsNoseMouthThroatSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EarsNoseMouthThroatSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EarsNoseMouthThroatSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateEarsNoseMouthThroatSectionTemplateId(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEarsNoseMouthThroatSectionTemplateId(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.20')";

	/**
	* The cached OCL invariant for the '{@link #validateEarsNoseMouthThroatSectionTemplateId(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEarsNoseMouthThroatSectionTemplateId(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param earsNoseMouthThroatSection The receiving '<em><b>Ears Nose Mouth Throat Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateEarsNoseMouthThroatSectionTemplateId(
			EarsNoseMouthThroatSection earsNoseMouthThroatSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.EARS_NOSE_MOUTH_THROAT_SECTION);
			try {
				VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			earsNoseMouthThroatSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.EARS_NOSE_MOUTH_THROAT_SECTION__EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("EarsNoseMouthThroatSectionTemplateId"),
					new Object[] { earsNoseMouthThroatSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEarsNoseMouthThroatSectionCode(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEarsNoseMouthThroatSectionCode(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11393-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateEarsNoseMouthThroatSectionCode(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEarsNoseMouthThroatSectionCode(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param earsNoseMouthThroatSection The receiving '<em><b>Ears Nose Mouth Throat Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateEarsNoseMouthThroatSectionCode(EarsNoseMouthThroatSection earsNoseMouthThroatSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.EARS_NOSE_MOUTH_THROAT_SECTION);
			try {
				VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			earsNoseMouthThroatSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.EARS_NOSE_MOUTH_THROAT_SECTION__EARS_NOSE_MOUTH_THROAT_SECTION_CODE,
					IHEPlugin.INSTANCE.getString("EarsNoseMouthThroatSectionCode"),
					new Object[] { earsNoseMouthThroatSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEarsNoseMouthThroatSectionProblemEntry(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Problem Entry</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEarsNoseMouthThroatSectionProblemEntry(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::ProblemEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEarsNoseMouthThroatSectionProblemEntry(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Problem Entry</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEarsNoseMouthThroatSectionProblemEntry(EarsNoseMouthThroatSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param earsNoseMouthThroatSection The receiving '<em><b>Ears Nose Mouth Throat Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateEarsNoseMouthThroatSectionProblemEntry(
			EarsNoseMouthThroatSection earsNoseMouthThroatSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.EARS_NOSE_MOUTH_THROAT_SECTION);
			try {
				VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			earsNoseMouthThroatSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.EARS_NOSE_MOUTH_THROAT_SECTION__EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY,
					IHEPlugin.INSTANCE.getString("EarsNoseMouthThroatSectionProblemEntry"),
					new Object[] { earsNoseMouthThroatSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getProblemEntry(EarsNoseMouthThroatSection) <em>Get Problem Entry</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemEntry(EarsNoseMouthThroatSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROBLEM_ENTRY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntry))->asSequence()->any(true).oclAsType(ihe::ProblemEntry)";

	/**
	* The cached OCL query for the '{@link #getProblemEntry(EarsNoseMouthThroatSection) <em>Get Problem Entry</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemEntry(EarsNoseMouthThroatSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProblemEntry getProblemEntry(EarsNoseMouthThroatSection earsNoseMouthThroatSection) {
		if (GET_PROBLEM_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.EARS_NOSE_MOUTH_THROAT_SECTION,
				IHEPackage.Literals.EARS_NOSE_MOUTH_THROAT_SECTION.getEAllOperations().get(58));
			try {
				GET_PROBLEM_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY__EOCL_QRY);
		return (ProblemEntry) query.evaluate(earsNoseMouthThroatSection);
	}

} // EarsNoseMouthThroatSectionOperations
