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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Advance Directives Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection#validateCodedAdvanceDirectivesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection#validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Advance Directives Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection#getAdvanceDirectivesObservations() <em>Get Advance Directives Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedAdvanceDirectivesSectionOperations extends AdvanceDirectivesSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedAdvanceDirectivesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedAdvanceDirectivesSectionTemplateId(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedAdvanceDirectivesSectionTemplateId(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.35')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedAdvanceDirectivesSectionTemplateId(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedAdvanceDirectivesSectionTemplateId(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedAdvanceDirectivesSection The receiving '<em><b>Coded Advance Directives Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedAdvanceDirectivesSectionTemplateId(
			CodedAdvanceDirectivesSection codedAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_ADVANCE_DIRECTIVES_SECTION__CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("CodedAdvanceDirectivesSectionTemplateId"),
					new Object[] { codedAdvanceDirectivesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Advance Directives Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::AdvanceDirectiveObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Advance Directives Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(CodedAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedAdvanceDirectivesSection The receiving '<em><b>Coded Advance Directives Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(
			CodedAdvanceDirectivesSection codedAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_ADVANCE_DIRECTIVES_SECTION__CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION,
					IHEPlugin.INSTANCE.getString("CodedAdvanceDirectivesSectionAdvanceDirectivesObservation"),
					new Object[] { codedAdvanceDirectivesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesObservations(CodedAdvanceDirectivesSection) <em>Get Advance Directives Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesObservations(CodedAdvanceDirectivesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::AdvanceDirectiveObservation)).oclAsType(ihe::AdvanceDirectiveObservation)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesObservations(CodedAdvanceDirectivesSection) <em>Get Advance Directives Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesObservations(CodedAdvanceDirectivesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<AdvanceDirectiveObservation> getAdvanceDirectivesObservations(
			CodedAdvanceDirectivesSection codedAdvanceDirectivesSection) {
		if (GET_ADVANCE_DIRECTIVES_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_ADVANCE_DIRECTIVES_SECTION,
				IHEPackage.Literals.CODED_ADVANCE_DIRECTIVES_SECTION.getEAllOperations().get(64));
			try {
				GET_ADVANCE_DIRECTIVES_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveObservation> result = (Collection<AdvanceDirectiveObservation>) query.evaluate(codedAdvanceDirectivesSection);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveObservation>(result.size(), result.toArray());
	}

} // CodedAdvanceDirectivesSectionOperations
