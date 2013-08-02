/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drug Allergy Problem Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getDrugAllergyProblemAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DrugAllergyProblemActParticipant1 DrugAllergyProblemActTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.1.48'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDrugAllergyProblemActDrugAllergyParticipation constraints.validation.error='DrugAllergyProblemActDrugAllergyParticipationDrugAllergyParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDrugAllergyProblemActDrugAllergyParticipationDrugAllergyParticipantRole constraints.validation.error='DrugAllergyProblemActDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntity'"
 * @generated
 */
public interface DrugAllergyProblemAct extends AllergyProblemAct {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	* @generated
	*/
	boolean validateDrugAllergyProblemActParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DrugAllergyProblemAct init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugAllergyProblemAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DrugAllergyProblemAct
