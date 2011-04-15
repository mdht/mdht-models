/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
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
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Intolerance Concern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern#validateAllergyIntoleranceConcernTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern#validateAllergyIntoleranceConcernAllergyIntolerance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Allergy Intolerance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern#getAllergyIntolerances() <em>Get Allergy Intolerances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceConcernOperations extends ConcernEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceConcernOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceConcernTemplateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceConcernTemplateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceConcernTemplateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceConcernTemplateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5.3')
	 * @param allergyIntoleranceConcern The receiving '<em><b>Allergy Intolerance Concern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyIntoleranceConcernTemplateId(AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE_CONCERN);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntoleranceConcern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("AllergyIntoleranceConcernTemplateId"),
						 new Object [] { allergyIntoleranceConcern }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceConcernAllergyIntolerance(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Allergy Intolerance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceConcernAllergyIntolerance(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::AllergyIntolerance) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceConcernAllergyIntolerance(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Allergy Intolerance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceConcernAllergyIntolerance(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::AllergyIntolerance) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param allergyIntoleranceConcern The receiving '<em><b>Allergy Intolerance Concern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyIntoleranceConcernAllergyIntolerance(AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE_CONCERN);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntoleranceConcern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE,
						 IHEPlugin.INSTANCE.getString("AllergyIntoleranceConcernAllergyIntolerance"),
						 new Object [] { allergyIntoleranceConcern }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyIntolerances(AllergyIntoleranceConcern) <em>Get Allergy Intolerances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerances(AllergyIntoleranceConcern)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_INTOLERANCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::AllergyIntolerance)).oclAsType(ihe::AllergyIntolerance)";

	/**
	 * The cached OCL query for the '{@link #getAllergyIntolerances(AllergyIntoleranceConcern) <em>Get Allergy Intolerances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerances(AllergyIntoleranceConcern)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_INTOLERANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::AllergyIntolerance)).oclAsType(ihe::AllergyIntolerance)
	 * @param allergyIntoleranceConcern The receiving '<em><b>Allergy Intolerance Concern</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<AllergyIntolerance> getAllergyIntolerances(AllergyIntoleranceConcern allergyIntoleranceConcern) {
		if (GET_ALLERGY_INTOLERANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.ALLERGY_INTOLERANCE_CONCERN, IHEPackage.Literals.ALLERGY_INTOLERANCE_CONCERN.getEAllOperations().get(68));
			try {
				GET_ALLERGY_INTOLERANCES__EOCL_QRY = helper.createQuery(GET_ALLERGY_INTOLERANCES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_INTOLERANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyIntolerance> result = (Collection<AllergyIntolerance>) query.evaluate(allergyIntoleranceConcern);
		return new BasicEList.UnmodifiableEList<AllergyIntolerance>(result.size(), result.toArray());
	}

} // AllergyIntoleranceConcernOperations