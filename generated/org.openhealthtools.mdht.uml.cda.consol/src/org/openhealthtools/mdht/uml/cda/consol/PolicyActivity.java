/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PolicyActivityTemplateId PolicyActivityClassCode PolicyActivityId PolicyActivityMoodCode PolicyActivityStatusCode PolicyActivityPayer PolicyActivityCoverage PolicyActivityEntryRelationship PolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet PolicyActivityPayerPayerAssignedEntityUSRealmAddressCity PolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine PolicyActivityPayerPayerAssignedEntityUSRealmAddressUse PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityCodeP PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorTemplateId PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleUSRealmAddressStreet PolicyActivityCoverageCoverageRoleUSRealmAddressCity PolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine PolicyActivityCoverageCoverageRoleUSRealmAddressUse PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleCodeP PolicyActivityCoverageTemplateId PolicyActivityCoverageTypeCode PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleUSRealmAddressStreet PolicyActivityHolderHolderRoleUSRealmAddressCity PolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine PolicyActivityHolderHolderRoleUSRealmAddressUse PolicyActivityHolderHolderRoleId PolicyActivityHolderTemplateId PolicyActivityHolderTypeCode PolicyActivityHolderHolderRole PolicyActivityEntryRelationshipTargetActActivity PolicyActivityEntryRelationshipDescriptionCoveragePlan PolicyActivityEntryRelationshipTypeCode' templateId.root='2.16.840.1.113883.10.20.22.4.61' classCode='ACT' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='PolicyActivityCode PolicyActivityCodeP PolicyActivityGuarantor PolicyActivityHolder PolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry PolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode PolicyActivityPayerPayerAssignedEntityUSRealmAddressState PolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityCoverageCoverageRoleUSRealmAddressCountry PolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode PolicyActivityCoverageCoverageRoleUSRealmAddressState PolicyActivityCoverageCoverageRoleUSRealmAddressUseP PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageLowTime PolicyActivityCoverageHighTime PolicyActivityCoverageTime PolicyActivityHolderHolderRoleUSRealmAddressCountry PolicyActivityHolderHolderRoleUSRealmAddressPostalCode PolicyActivityHolderHolderRoleUSRealmAddressState PolicyActivityHolderHolderRoleUSRealmAddressUseP PolicyActivityHolderHolderRoleAddr' constraints.validation.dependOn.PolicyActivityCode='PolicyActivityCodeP' moodCode='EVN' statusCode.code='completed' constraints.validation.query='PolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet PolicyActivityPayerPayerAssignedEntityUSRealmAddressCity PolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry PolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode PolicyActivityPayerPayerAssignedEntityUSRealmAddressState PolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine PolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP PolicyActivityPayerPayerAssignedEntityUSRealmAddressUse PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityCodeP PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleUSRealmAddressStreet PolicyActivityCoverageCoverageRoleUSRealmAddressCity PolicyActivityCoverageCoverageRoleUSRealmAddressCountry PolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode PolicyActivityCoverageCoverageRoleUSRealmAddressState PolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine PolicyActivityCoverageCoverageRoleUSRealmAddressUseP PolicyActivityCoverageCoverageRoleUSRealmAddressUse PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleCodeP PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageLowTime PolicyActivityCoverageHighTime PolicyActivityCoverageTemplateId PolicyActivityCoverageTypeCode PolicyActivityCoverageTime PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleUSRealmAddressStreet PolicyActivityHolderHolderRoleUSRealmAddressCity PolicyActivityHolderHolderRoleUSRealmAddressCountry PolicyActivityHolderHolderRoleUSRealmAddressPostalCode PolicyActivityHolderHolderRoleUSRealmAddressState PolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine PolicyActivityHolderHolderRoleUSRealmAddressUseP PolicyActivityHolderHolderRoleUSRealmAddressUse PolicyActivityHolderHolderRoleId PolicyActivityHolderHolderRoleAddr PolicyActivityHolderTemplateId PolicyActivityHolderTypeCode PolicyActivityHolderTime PolicyActivityHolderHolderRole PolicyActivityEntryRelationshipTargetActActivity PolicyActivityEntryRelationshipDescriptionCoveragePlan PolicyActivityEntryRelationshipTypeCode' constraints.validation.dependOn.PolicyActivityPayerPayerAssignedEntityUSRealmAddressUse='PolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityHolderTime' constraints.validation.dependOn.PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse='PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP' constraints.validation.dependOn.PolicyActivityCoverageCoverageRoleUSRealmAddressUse='PolicyActivityCoverageCoverageRoleUSRealmAddressUseP' constraints.validation.dependOn.PolicyActivityHolderHolderRoleUSRealmAddressUse='PolicyActivityHolderHolderRoleUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayer constraints.validation.error='PayerTemplateId PayerTypeCode PayerPayerAssignedEntity PayerPayerAssignedEntityUSRealmAddressStreet PayerPayerAssignedEntityUSRealmAddressCity PayerPayerAssignedEntityUSRealmAddressStreetAddressLine PayerPayerAssignedEntityUSRealmAddressUse PayerPayerAssignedEntityId PayerPayerAssignedEntityCode PayerPayerAssignedEntityCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.87' typeCode='PRF' constraints.validation.query='PayerPayerAssignedEntityUSRealmAddressStreet PayerPayerAssignedEntityUSRealmAddressCity PayerPayerAssignedEntityUSRealmAddressCountry PayerPayerAssignedEntityUSRealmAddressPostalCode PayerPayerAssignedEntityUSRealmAddressState PayerPayerAssignedEntityUSRealmAddressStreetAddressLine PayerPayerAssignedEntityUSRealmAddressUseP PayerPayerAssignedEntityUSRealmAddressUse PayerPayerAssignedEntityPayerOrganizationName PayerPayerAssignedEntityId PayerPayerAssignedEntityCode PayerPayerAssignedEntityCodeP PayerPayerAssignedEntityAddr PayerPayerAssignedEntityTelecom PayerPayerAssignedEntityPayerOrganization' constraints.validation.warning='PayerPayerAssignedEntityUSRealmAddressCountry PayerPayerAssignedEntityUSRealmAddressPostalCode PayerPayerAssignedEntityUSRealmAddressState PayerPayerAssignedEntityUSRealmAddressUseP PayerPayerAssignedEntityPayerOrganizationName PayerPayerAssignedEntityPayerOrganization' constraints.validation.dependOn.PayerPayerAssignedEntityUSRealmAddressUse='PayerPayerAssignedEntityUSRealmAddressUseP' constraints.validation.info='PayerPayerAssignedEntityAddr PayerPayerAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntity constraints.validation.error='PayerAssignedEntityId PayerAssignedEntityCode PayerAssignedEntityCodeP PayerAssignedEntityUSRealmAddressStreet PayerAssignedEntityUSRealmAddressCity PayerAssignedEntityUSRealmAddressStreetAddressLine PayerAssignedEntityUSRealmAddressUse' code.codeSystem='2.16.840.1.113883.5.110' code.codeSystemName='HL7RoleClass' constraints.validation.info='PayerAssignedEntityAddr PayerAssignedEntityTelecom' constraints.validation.warning='PayerAssignedEntityPayerOrganization PayerAssignedEntityUSRealmAddressCountry PayerAssignedEntityUSRealmAddressPostalCode PayerAssignedEntityUSRealmAddressState PayerAssignedEntityUSRealmAddressUseP PayerAssignedEntityPayerOrganizationName' constraints.validation.query='PayerAssignedEntityUSRealmAddressStreet PayerAssignedEntityUSRealmAddressCity PayerAssignedEntityUSRealmAddressCountry PayerAssignedEntityUSRealmAddressPostalCode PayerAssignedEntityUSRealmAddressState PayerAssignedEntityUSRealmAddressStreetAddressLine PayerAssignedEntityUSRealmAddressUseP PayerAssignedEntityUSRealmAddressUse PayerAssignedEntityPayerOrganizationName' constraints.validation.dependOn.PayerAssignedEntityUSRealmAddressUse='PayerAssignedEntityUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntityPayerOrganization constraints.validation.warning='PayerOrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantor constraints.validation.error='GuarantorTemplateId GuarantorGuarantorAssignedEntity GuarantorGuarantorAssignedEntityUSRealmAddressStreet GuarantorGuarantorAssignedEntityUSRealmAddressCity GuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine GuarantorGuarantorAssignedEntityUSRealmAddressUse GuarantorGuarantorAssignedEntityCode GuarantorGuarantorAssignedEntityCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.88' constraints.validation.warning='GuarantorTime GuarantorTypeCode GuarantorGuarantorAssignedEntityUSRealmAddressCountry GuarantorGuarantorAssignedEntityUSRealmAddressPostalCode GuarantorGuarantorAssignedEntityUSRealmAddressState GuarantorGuarantorAssignedEntityUSRealmAddressUseP GuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorGuarantorAssignedEntityAddr GuarantorGuarantorAssignedEntityTelecom' typeCode='PRF' constraints.validation.query='GuarantorGuarantorAssignedEntityUSRealmAddressStreet GuarantorGuarantorAssignedEntityUSRealmAddressCity GuarantorGuarantorAssignedEntityUSRealmAddressCountry GuarantorGuarantorAssignedEntityUSRealmAddressPostalCode GuarantorGuarantorAssignedEntityUSRealmAddressState GuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine GuarantorGuarantorAssignedEntityUSRealmAddressUseP GuarantorGuarantorAssignedEntityUSRealmAddressUse GuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorGuarantorAssignedEntityCode GuarantorGuarantorAssignedEntityCodeP GuarantorGuarantorAssignedEntityAddr GuarantorGuarantorAssignedEntityTelecom' constraints.validation.dependOn.GuarantorGuarantorAssignedEntityUSRealmAddressUse='GuarantorGuarantorAssignedEntityUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantorGuarantorAssignedEntity constraints.validation.warning='GuarantorAssignedEntityPersonNameAndOrOrgName GuarantorAssignedEntityAddr GuarantorAssignedEntityTelecom GuarantorAssignedEntityUSRealmAddressCountry GuarantorAssignedEntityUSRealmAddressPostalCode GuarantorAssignedEntityUSRealmAddressState GuarantorAssignedEntityUSRealmAddressUseP' code.code='GUAR' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.error='GuarantorAssignedEntityCode GuarantorAssignedEntityCodeP GuarantorAssignedEntityUSRealmAddressStreet GuarantorAssignedEntityUSRealmAddressCity GuarantorAssignedEntityUSRealmAddressStreetAddressLine GuarantorAssignedEntityUSRealmAddressUse' constraints.validation.query='GuarantorAssignedEntityUSRealmAddressStreet GuarantorAssignedEntityUSRealmAddressCity GuarantorAssignedEntityUSRealmAddressCountry GuarantorAssignedEntityUSRealmAddressPostalCode GuarantorAssignedEntityUSRealmAddressState GuarantorAssignedEntityUSRealmAddressStreetAddressLine GuarantorAssignedEntityUSRealmAddressUseP GuarantorAssignedEntityUSRealmAddressUse' constraints.validation.dependOn.GuarantorAssignedEntityUSRealmAddressUse='GuarantorAssignedEntityUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverage constraints.validation.error='CoverageTemplateId CoverageTypeCode CoverageCoverageRole CoverageCoverageRoleUSRealmAddressStreet CoverageCoverageRoleUSRealmAddressCity CoverageCoverageRoleUSRealmAddressStreetAddressLine CoverageCoverageRoleUSRealmAddressUse CoverageCoverageRoleCoveragePlayingEntityName CoverageCoverageRoleId CoverageCoverageRoleCode CoverageCoverageRoleCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.89' constraints.validation.warning='CoverageLowTime CoverageHighTime CoverageTime CoverageCoverageRoleUSRealmAddressCountry CoverageCoverageRoleUSRealmAddressPostalCode CoverageCoverageRoleUSRealmAddressState CoverageCoverageRoleUSRealmAddressUseP CoverageCoverageRoleAddr CoverageCoverageRoleCoveragePlayingEntity' typeCode='COV' constraints.validation.query='CoverageCoverageRoleUSRealmAddressStreet CoverageCoverageRoleUSRealmAddressCity CoverageCoverageRoleUSRealmAddressCountry CoverageCoverageRoleUSRealmAddressPostalCode CoverageCoverageRoleUSRealmAddressState CoverageCoverageRoleUSRealmAddressStreetAddressLine CoverageCoverageRoleUSRealmAddressUseP CoverageCoverageRoleUSRealmAddressUse CoverageCoverageRoleCoveragePlayingEntityName CoverageCoverageRoleId CoverageCoverageRoleCode CoverageCoverageRoleCodeP CoverageCoverageRoleAddr CoverageCoverageRoleCoveragePlayingEntity' constraints.validation.dependOn.CoverageCoverageRoleUSRealmAddressUse='CoverageCoverageRoleUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRole constraints.validation.error='CoverageRoleId CoverageRoleCode CoverageRoleCodeP CoverageRoleUSRealmAddressStreet CoverageRoleUSRealmAddressCity CoverageRoleUSRealmAddressStreetAddressLine CoverageRoleUSRealmAddressUse CoverageRoleCoveragePlayingEntityName' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='CoverageRoleAddr CoverageRoleCoveragePlayingEntity CoverageRoleUSRealmAddressCountry CoverageRoleUSRealmAddressPostalCode CoverageRoleUSRealmAddressState CoverageRoleUSRealmAddressUseP' constraints.validation.query='CoverageRoleUSRealmAddressStreet CoverageRoleUSRealmAddressCity CoverageRoleUSRealmAddressCountry CoverageRoleUSRealmAddressPostalCode CoverageRoleUSRealmAddressState CoverageRoleUSRealmAddressStreetAddressLine CoverageRoleUSRealmAddressUseP CoverageRoleUSRealmAddressUse CoverageRoleCoveragePlayingEntityName' constraints.validation.dependOn.CoverageRoleUSRealmAddressUse='CoverageRoleUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRoleCoveragePlayingEntity constraints.validation.error='CoveragePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolder constraints.validation.error='HolderTemplateId HolderTypeCode HolderHolderRole HolderHolderRoleUSRealmAddressStreet HolderHolderRoleUSRealmAddressCity HolderHolderRoleUSRealmAddressStreetAddressLine HolderHolderRoleUSRealmAddressUse HolderHolderRoleId' templateId.root='2.16.840.1.113883.10.20.22.4.90' typeCode='HLD' constraints.validation.info='HolderTime' constraints.validation.query='HolderHolderRoleUSRealmAddressStreet HolderHolderRoleUSRealmAddressCity HolderHolderRoleUSRealmAddressCountry HolderHolderRoleUSRealmAddressPostalCode HolderHolderRoleUSRealmAddressState HolderHolderRoleUSRealmAddressStreetAddressLine HolderHolderRoleUSRealmAddressUseP HolderHolderRoleUSRealmAddressUse HolderHolderRoleId HolderHolderRoleAddr' constraints.validation.warning='HolderHolderRoleUSRealmAddressCountry HolderHolderRoleUSRealmAddressPostalCode HolderHolderRoleUSRealmAddressState HolderHolderRoleUSRealmAddressUseP HolderHolderRoleAddr' constraints.validation.dependOn.HolderHolderRoleUSRealmAddressUse='HolderHolderRoleUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolderHolderRole constraints.validation.error='HolderRoleId HolderRoleUSRealmAddressStreet HolderRoleUSRealmAddressCity HolderRoleUSRealmAddressStreetAddressLine HolderRoleUSRealmAddressUse' constraints.validation.warning='HolderRoleAddr HolderRoleUSRealmAddressCountry HolderRoleUSRealmAddressPostalCode HolderRoleUSRealmAddressState HolderRoleUSRealmAddressUseP' constraints.validation.query='HolderRoleUSRealmAddressStreet HolderRoleUSRealmAddressCity HolderRoleUSRealmAddressCountry HolderRoleUSRealmAddressPostalCode HolderRoleUSRealmAddressState HolderRoleUSRealmAddressStreetAddressLine HolderRoleUSRealmAddressUseP HolderRoleUSRealmAddressUse' constraints.validation.dependOn.HolderRoleUSRealmAddressUse='HolderRoleUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityEntryRelationship constraints.validation.error='EntryRelationshipTargetActActivity EntryRelationshipDescriptionCoveragePlan EntryRelationshipTypeCode' typeCode='REFR'"
 * @generated
 */
public interface PolicyActivity extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.61\')'"
	 * @generated
	 */
	boolean validatePolicyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validatePolicyActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'12\' or value.code = \'13\' or value.code = \'14\' or value.code = \'15\' or value.code = \'16\' or value.code = \'41\' or value.code = \'42\' or value.code = \'43\' or value.code = \'47\' or value.code = \'AP\' or value.code = \'C1\' or value.code = \'CO\' or value.code = \'CP\' or value.code = \'D\' or value.code = \'DB\' or value.code = \'EP\' or value.code = \'FF\' or value.code = \'GP\' or value.code = \'HM\' or value.code = \'HN\' or value.code = \'HS\' or value.code = \'IN\' or value.code = \'IP\' or value.code = \'LC\' or value.code = \'LD\' or value.code = \'LI\' or value.code = \'LT\' or value.code = \'MA\' or value.code = \'MB\' or value.code = \'MC\' or value.code = \'MH\' or value.code = \'MI\' or value.code = \'MP\' or value.code = \'OT\' or value.code = \'PE\' or value.code = \'PL\' or value.code = \'PP\' or value.code = \'PR\' or value.code = \'PS\' or value.code = \'QM\' or value.code = \'RP\' or value.code = \'SP\' or value.code = \'TF\' or value.code = \'WC\' or value.code = \'WU\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validatePolicyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validatePolicyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'completed\')'"
	 * @generated
	 */
	boolean validatePolicyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityPayer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::COV)->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverage(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::HLD)->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityHolder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->notEmpty()'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject(not use->isEmpty())'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.110\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject(not use->isEmpty())'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((performer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) and performer.assignedEntity.assignedPerson.name->size() >0) or (performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) and performer.assignedEntity.representedOrganization.name->size() >0 ))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.code = \'GUAR\' and value.codeSystem = \'2.16.840.1.113883.5.111\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(not use->isEmpty())'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and (value.code = \'FAMDEP\' or value.code = \'FSTUD\' or value.code = \'HANDIC\' or value.code = \'INJ\' or value.code = \'PSTUD\' or value.code = \'SELF\' or value.code = \'SPON\' or value.code = \'STUD\')))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.low.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageLowTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageHighTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.89\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(typeCode=vocab::ParticipationType::COV)'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(not use->isEmpty())'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.90\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(typeCode=vocab::ParticipationType::HLD)'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->one(a : cda::Act | a.oclIsTypeOf(consol::AuthorizationActivity) or (a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and a.moodCode=vocab::x_DocumentActMood::DEF)))'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationshipTargetActActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->select(a : cda::Act | a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and (a.moodCode=vocab::x_DocumentActMood::DEF))->forAll(id->size() > 0 and text->size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validatePolicyActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PolicyActivity
