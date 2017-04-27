/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chemotherapy Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getChemotherapyMedicationActivity()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication Activity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Chemotherapy Medication ActivityTemplateId Chemotherapy Medication ActivityDoseQuantity Chemotherapy Medication ActivityEffectiveTime Chemotherapy Medication ActivityRepeatNumber Chemotherapy Medication ActivityRouteCode Chemotherapy Medication ActivityRouteCodeP' templateId.root='2.16.840.1.113883.10.20.30.3.44' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' constraints.validation.info='Chemotherapy Medication ActivityClinical Drug Trial Chemotherapy Medication ActivityChemotherapy Protocol Reference'"
 * @generated
 */
public interface ChemotherapyMedicationActivity extends MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication ActivityDoseQuantity'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateChemotherapyMedicationActivityDoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication ActivityEffectiveTime'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)'"
	 * @generated
	 */
	boolean validateChemotherapyMedicationActivityEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication ActivityRepeatNumber'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateChemotherapyMedicationActivityRepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication ActivityRouteCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateChemotherapyMedicationActivityRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication ActivityRouteCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and (value.code = \'C38192\' or value.code = \'C38193\' or value.code = \'C38194\' or value.code = \'C38675\' or value.code = \'C38197\' or value.code = \'C38633\' or value.code = \'C38205\' or value.code = \'C38206\' or value.code = \'C38208\' or value.code = \'C38209\' or value.code = \'C38210\' or value.code = \'C38211\' or value.code = \'C38212\' or value.code = \'C38200\' or value.code = \'C38215\' or value.code = \'C38219\' or value.code = \'C38220\' or value.code = \'C38221\' or value.code = \'C38222\' or value.code = \'C38223\' or value.code = \'C38224\' or value.code = \'C38225\' or value.code = \'C38226\' or value.code = \'C38227\' or value.code = \'C38228\' or value.code = \'C38229\' or value.code = \'C38230\' or value.code = \'C38231\' or value.code = \'C38232\' or value.code = \'C38233\' or value.code = \'C38234\' or value.code = \'C38217\' or value.code = \'C38218\' or value.code = \'C38235\' or value.code = \'C38238\' or value.code = \'C38239\' or value.code = \'C38240\' or value.code = \'C38241\' or value.code = \'C38242\' or value.code = \'C38243\' or value.code = \'C38245\' or value.code = \'C38246\' or value.code = \'C38247\' or value.code = \'C38249\' or value.code = \'C38250\' or value.code = \'C38251\' or value.code = \'C38252\' or value.code = \'C38253\' or value.code = \'C38254\' or value.code = \'C28161\' or value.code = \'C38255\' or value.code = \'C38256\' or value.code = \'C38257\' or value.code = \'C38258\' or value.code = \'C38259\' or value.code = \'C38260\' or value.code = \'C38261\' or value.code = \'C38262\' or value.code = \'C38263\' or value.code = \'C38264\' or value.code = \'C38265\' or value.code = \'C38266\' or value.code = \'C38267\' or value.code = \'C38207\' or value.code = \'C38268\' or value.code = \'C38269\' or value.code = \'C38270\' or value.code = \'C38272\' or value.code = \'C38273\' or value.code = \'C38276\' or value.code = \'C38277\' or value.code = \'C38278\' or value.code = \'C38280\' or value.code = \'C38203\' or value.code = \'C38281\' or value.code = \'C38282\' or value.code = \'C38284\' or value.code = \'C38285\' or value.code = \'C48623\' or value.code = \'C38286\' or value.code = \'C38287\' or value.code = \'C38288\' or value.code = \'C38289\' or value.code = \'C38291\' or value.code = \'C38676\' or value.code = \'C38292\' or value.code = \'C38677\' or value.code = \'C38293\' or value.code = \'C38294\' or value.code = \'C38295\' or value.code = \'C38216\' or value.code = \'C38296\' or value.code = \'C38198\' or value.code = \'C38297\' or value.code = \'C38298\' or value.code = \'C38299\' or value.code = \'C38300\' or value.code = \'C38301\' or value.code = \'C38304\' or value.code = \'C38305\' or value.code = \'C38283\' or value.code = \'C38307\' or value.code = \'C38308\' or value.code = \'C38309\' or value.code = \'C38312\' or value.code = \'C38271\'))'"
	 * @generated
	 */
	boolean validateChemotherapyMedicationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication ActivityClinical Drug Trial'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(clondata::ClinicalDrugTrial) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateChemotherapyMedicationActivityClinicalDrugTrial(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Chemotherapy Medication ActivityChemotherapy Protocol Reference'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(clondata::ChemotherapyProtocolReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateChemotherapyMedicationActivityChemotherapyProtocolReference(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getClinical Drug Trials'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::ClinicalDrugTrial)).oclAsType(clondata::ClinicalDrugTrial)'"
	 * @generated
	 */
	EList<ClinicalDrugTrial> getClinicalDrugTrials();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getChemotherapy Protocol References'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::ChemotherapyProtocolReference)).oclAsType(clondata::ChemotherapyProtocolReference)'"
	 * @generated
	 */
	EList<ChemotherapyProtocolReference> getChemotherapyProtocolReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyMedicationActivity init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyMedicationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ChemotherapyMedicationActivity
